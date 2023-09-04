SUMMARY = "Converter for OriginLab OPJ project files"
DESCRIPTION = "Converter for OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "liborigin-tools-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "33eb017aa7c870c543e4a419e1e42a090a6af8921ceda78e12bf4d5d932340a33ff4ee8fda1190d1d3e723b8312edb075b37f147a0671bcf92993d44a196006f"

RPROVIDES:${PN} += "liborigin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liborigin.so.3 \
libstdc++.so.6"

inherit rpm
