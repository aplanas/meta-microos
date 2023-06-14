SUMMARY = "Japanese Morphological Analysis System"
DESCRIPTION = "ChaSen is a Japanese morphological analysis system."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-2.4.5-2.11.aarch64.rpm"
RPM_HASH = "f4d0c4cf1e0dbaa7850942b5bc4f3ef68f275f46831a3a4dc027fa98880367accfed30e55629ed58a8f53405e1acc6f053eb7637176c5f7b242a0606104149a4"

RPROVIDES:${PN} += "chasen \
libchasen.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipadic \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
