SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-avr-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "a006b018b6ba76d593de7e12d0f7c21aeebdbbedff224671da2d9d61d763d41b8867ffd3f8475ba1b1e0cd5d61c74c001b5c134bbe8a56de533cea96d7ab6dc0"

RPROVIDES:${PN} += "cross-avr-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
