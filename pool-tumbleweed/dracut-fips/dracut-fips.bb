SUMMARY = "Dracut modules to build a dracut initramfs with an integrity check"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs with dracut, which does an integrity check of the kernel \
and its cryptography during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.375.gafb362e4"

RPM_NAME = "dracut-fips-059+suse.375.gafb362e4-1.1.aarch64.rpm"
RPM_HASH = "7a365c63632c2f8a0b53eb0ecbb28a4433eaaab489116fe2da6e05ec9f0f99f8112bf073adb95df7d39a63a21374c0ac10f4ad2eedca89a0cbb035b80643954e"

RPROVIDES:${PN} += "config(dracut-fips) \
dracut-fips \
dracut-fips(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dracut \
libcryptsetup12-hmac \
libgcrypt20-hmac \
libkcapi-tools \
libopenssl1_1-hmac"

inherit rpm
