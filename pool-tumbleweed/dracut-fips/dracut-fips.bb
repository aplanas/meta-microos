SUMMARY = "Dracut modules to build a dracut initramfs with an integrity check"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs with dracut, which does an integrity check of the kernel \
and its cryptography during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.497.ga7feaf12"

RPM_NAME = "dracut-fips-059+suse.497.ga7feaf12-1.1.aarch64.rpm"
RPM_HASH = "22b1d4e0c5ebc09c3bce60cde1098e8d931c636ca335f01158fbb99e3e73a8c15ad4ca226b540859cb8a42bb521dcea21277cf799addb78e54df0574b08bf9a9"

RPROVIDES:${PN} += "config-dracut-fips \
dracut-fips"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
libcryptsetup12-hmac \
libgcrypt20-hmac \
libkcapi-tools \
libopenssl1-1-hmac"

inherit rpm
