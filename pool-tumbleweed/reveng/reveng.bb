SUMMARY = "An arbitrary-precision CRC calculator and algorithm finder"
DESCRIPTION = "CRC RevEng is an arbitrary-precision CRC calculator and \
algorithm finder. It calculates CRCs using any of the 72 preset \
algorithms, or a user-specified algorithm to any width. It calculates \
reversed CRCs to give the bit pattern that produces a desired forward \
CRC. CRC RevEng also reverse-engineers any CRC algorithm from \
sufficient correctly formatted message-CRC pairs and optional known \
parameters. It comprises input interpretation options. \
It is compliant with Ross Williams' Rocksoft model of parametrised CRC \
algorithms."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.5"

RPM_NAME = "reveng-3.0.5-1.2.aarch64.rpm"
RPM_HASH = "8b2107a08eb14307791c7a101b5cf7e3795f91552980540c8f9c672937cbc0b8cc23d4e4c4322a01bc0b582f91e25f63c4588b04456193e17ee3e3738db5a8f6"

RPROVIDES:${PN} += "reveng \
reveng(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
