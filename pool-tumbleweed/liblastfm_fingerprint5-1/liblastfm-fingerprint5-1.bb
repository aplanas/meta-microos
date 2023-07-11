SUMMARY = "A Qt C++ Library for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm_fingerprint5-1-1.1.0-1.11.aarch64.rpm"
RPM_HASH = "cda9c5497e9160f83a06ed7ab1ad44161834d7c36cca65b82103c24e19d8b77fbe5ce26e0d590ca77432e7ebf40a58b1aac3e22dc81567a1a5ee13b277cfe08e"

RPROVIDES:${PN} += "liblastfm-fingerprint5-1 \
liblastfm-fingerprint5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
liblastfm5.so.1 \
libm.so.6 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
