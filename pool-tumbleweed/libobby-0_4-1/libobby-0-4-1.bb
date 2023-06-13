SUMMARY = "Synced document buffers"
DESCRIPTION = "obby is a library which provides synced document buffers. It supports \
multiple documents in one session and is portable to both Windows and \
Unix-like platforms. \
 \
 \
 \
Authors: \
-------- \
    Armin Burgmeier <armin@0x539.de> \
    Philipp Kern <phil@0x539.de>"
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "libobby-0_4-1-0.4.8-11.29.aarch64.rpm"
RPM_HASH = "564db3b5570bab5da786a5a985f5f2d5affb65ddf5eae53b8af5007bf83121994b8dfdff8fff193eb92fc793f910e36635a0a91e11e5440faaebed973624838a"

RPROVIDES:${PN} += "libobby-0.4.so.1()(64bit) \
libobby-0_4-1 \
libobby-0_4-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnet6-1.3.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
obby"

inherit rpm
