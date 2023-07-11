SUMMARY = "Sample CMIS client"
DESCRIPTION = "Sample client to access CMIS-enabled repositories using libcmis."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "cmis-client-0.5.2-1.25.aarch64.rpm"
RPM_HASH = "f9d42945e1e0d1ae74b6becd597d0b8112737636ed5a58d958edee83e54bcc19fb46b4962d2022bd2f8d27f43c7c9c277de2bd32c1540c74e5e69be19c6cc1d5"

RPROVIDES:${PN} += "cmis-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcmis-0-5-5 \
libcmis-0.5.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
