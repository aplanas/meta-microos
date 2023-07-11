SUMMARY = "EXR file import and export for PFS tools"
DESCRIPTION = "This package contains two-way conversion filters between the EXR file \
format and pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-exr-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "2e58fda45e6a07ff11fc080a1a7fbecb77e49529d9d04347269c73e0a8839bcfde3d7caeef86a01e63916b830fa9a32f7f36232565dc8704e8784a57d2767601"

RPROVIDES:${PN} += "pfstools-exr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
