SUMMARY = "C++ library for accessing sonos devices"
DESCRIPTION = "C++ library for accessing sonos devices \
The API supports basic features to browse music index and control playback \
in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "libnoson2-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "edaea1e20b325e8edfcd8858e7abbb8da0b5004703fa51f6204a0e58dc385322405e44e16a8321fd210f6ec9f47c96bdc7888a0c1e2f639c6561b6378d43f94f"

RPROVIDES:${PN} += "libnoson.so.2 \
libnoson2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.10 \
libFLAC.so.12 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
