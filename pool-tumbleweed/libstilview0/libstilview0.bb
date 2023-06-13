SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libstilview0-2.4.2-2.1.aarch64.rpm"
RPM_HASH = "ea91e3ec1c431670327d6e2e0f902b4ca10650f0de2d1c99e5d766a3d86be22067f8fc77e0c75c419ce533b7ab81170dbdcf13ad014d1290db673f0976af664f"

RPROVIDES:${PN} += "libstilview.so.0()(64bit) \
libstilview0 \
libstilview0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
