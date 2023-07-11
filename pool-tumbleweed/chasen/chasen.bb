SUMMARY = "Japanese Morphological Analysis System"
DESCRIPTION = "ChaSen is a Japanese morphological analysis system."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-2.4.5-2.12.aarch64.rpm"
RPM_HASH = "aee6dc608737a5cdc8cf32bc0f5b3e332cd6ec7ecd151825399ffa28cd87a245ad7c1f91d58506e3cdc1eedb9a058e7318f3ac889b2bf6f776588057897c4408"

RPROVIDES:${PN} += "chasen \
libchasen.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipadic \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
