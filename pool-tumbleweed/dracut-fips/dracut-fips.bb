SUMMARY = "Dracut modules to build a dracut initramfs with an integrity check"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs with dracut, which does an integrity check of the kernel \
and its cryptography during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.491.g87f19c22"

RPM_NAME = "dracut-fips-059+suse.491.g87f19c22-1.1.aarch64.rpm"
RPM_HASH = "46cedcd17fcbdaa49eb51c577de3ab715c18b53aa2e18ca20a017bde906a74b58308c9a417988ff27029c68d68bc2bcd97a6bffbb2b05a7decabf5cf04c268d5"

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
