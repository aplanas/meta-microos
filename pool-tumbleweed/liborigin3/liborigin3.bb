SUMMARY = "A library for reading OriginLab OPJ project files"
DESCRIPTION = "A library for reading OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "liborigin3-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "356753ac3a3f107263f96174884af1e04af162ea8695ccd74348f656ebe883d2aa886ae5e15e66c2dbd7ce2056407b4c73bd6f5ca0e6e9e7afe35b74e719fbb2"

RPROVIDES:${PN} += "liborigin.so.3 \
liborigin3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
