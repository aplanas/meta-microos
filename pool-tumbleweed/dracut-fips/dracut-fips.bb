SUMMARY = "Dracut modules to build a dracut initramfs with an integrity check"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs with dracut, which does an integrity check of the kernel \
and its cryptography during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.447.g9d1fc722"

RPM_NAME = "dracut-fips-059+suse.447.g9d1fc722-1.1.aarch64.rpm"
RPM_HASH = "877ac42756c5d8b3eee156cf84cf62dac6de4995eab9a6e9fc17c757c6348413d773722aa81c2ca20fa58512f5036520adcb6ebed2b88f5ca31b0ebb8052eb05"

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
