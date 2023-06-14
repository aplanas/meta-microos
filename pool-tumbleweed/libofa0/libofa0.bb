SUMMARY = "Open Fingerprint Architecture Library"
DESCRIPTION = "MusicDNS and the Open Fingerprint Architecture provide a system for \
identifying a piece of music with nothing more than the sound of the \
piece itself. \
This library is by design compatible with the MusicDNS web service. \
Non-commercial access to the service is available at \
http://www.musicdns.org."
LICENSE = "GPL-2.0-or-later | APL-1.0"

PV = "0.9.3"

RPM_NAME = "libofa0-0.9.3-104.15.aarch64.rpm"
RPM_HASH = "e8f7af6b85b5526c2355da100ac69d022f2f4a25013d001dcab3dd6e38018edb774e2e9222124cbb0adb686666af23dcc383ac3376c2ec8d5aecd00b3bab733e"

RPROVIDES:${PN} += "libofa \
libofa.so.0 \
libofa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
