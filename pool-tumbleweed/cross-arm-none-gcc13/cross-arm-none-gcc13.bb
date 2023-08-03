SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-arm-none-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "17e4236741fc015070b6fedc6af8804f08d8eaeb02f50dfdaefc69ea4c2bb69e3c3765cb0c2a26a381e7e9a9406525927685e2301be457caa5c8c49e0c7796b7"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
