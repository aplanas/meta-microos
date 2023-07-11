SUMMARY = "Open Fingerprint Architecture Library"
DESCRIPTION = "MusicDNS and the Open Fingerprint Architecture provide a system for \
identifying a piece of music with nothing more than the sound of the \
piece itself. \
This library is by design compatible with the MusicDNS web service. \
Non-commercial access to the service is available at \
http://www.musicdns.org."
LICENSE = "GPL-2.0-or-later | APL-1.0"

PV = "0.9.3"

RPM_NAME = "libofa0-0.9.3-104.16.aarch64.rpm"
RPM_HASH = "85250416e1e48ed6c69d5875c567cd1b116767d6f0e938056168cd52decbe00bdca5ba1e6cd1ec85a219a707499c6c90339408fdce57d25cac255ac6e0140ad7"

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
