SUMMARY = "Sample CMIS client"
DESCRIPTION = "Sample client to access CMIS-enabled repositories using libcmis."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "cmis-client-0.5.2-1.24.aarch64.rpm"
RPM_HASH = "c2b0b07ec024411eae26e170a0189eb2513feaace9be82f2c8e6673ca52117238f38c6518e763e748b5665ce3914c6deb329795e9c45a5107e8c4ee84faa4047"

RPROVIDES:${PN} += "cmis-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcmis-0-5-5 \
libcmis-0.5.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
