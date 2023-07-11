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

RPM_NAME = "libobby-0_4-1-0.4.8-11.30.aarch64.rpm"
RPM_HASH = "554c3b476b068c0c3b2927f09b881fd9ca845b32cbfadc5261d2438188f41019f3d589bae1a836074f61c274cf7e7696a2b5de48204fb357573366034d440e5a"

RPROVIDES:${PN} += "libobby-0-4-1 \
libobby-0.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libnet6-1.3.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
obby"

inherit rpm
