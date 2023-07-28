SUMMARY = "Library to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "libyara10-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "2e4607e6960832a7c02ab3b8562d8b796628783ef2046ec45a9aaa0692b4bc295b3714cd93febff60d0d9e0fc4d9016e27adc0cbe6b7d6152204b1c830bd99ad"

RPROVIDES:${PN} += "libyara.so.10 \
libyara10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libm.so.6 \
libmagic.so.1"

inherit rpm
