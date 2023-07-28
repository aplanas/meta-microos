SUMMARY = "Dracut modules to build a dracut initramfs with an integrity check"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs with dracut, which does an integrity check of the kernel \
and its cryptography during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.476.g5e324584"

RPM_NAME = "dracut-fips-059+suse.476.g5e324584-1.1.aarch64.rpm"
RPM_HASH = "db6b90dcc99e55365e633b0d622df1288ea022b41fa86f0d0ade35a1abc443450aae95f6096667e783d6396e98a77322e62f22c56ab06bcd3b6c04eb949aaff0"

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
