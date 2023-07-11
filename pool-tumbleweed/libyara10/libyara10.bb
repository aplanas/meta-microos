SUMMARY = "Library to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "libyara10-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "44d5eafea0a7bc0d7baad65b61287c4e56951db72573575961b1be377989020dac240a89a346ffd7c5d4fc774e4da482ec957c29efda992a0c355cbe00850094"

RPROVIDES:${PN} += "libyara.so.10 \
libyara10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libm.so.6 \
libmagic.so.1"

inherit rpm
