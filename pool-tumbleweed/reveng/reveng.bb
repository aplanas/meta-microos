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

RPM_NAME = "reveng-3.0.5-1.3.aarch64.rpm"
RPM_HASH = "f2c4740c69dd45732f0576a7ce3457cb11fd750654777e15a08383a5dbdccf30ddf16abfd5d4ec0c252eab4bf552ee62af3c7ad1ca5fc4bcd6ce8b13891d075f"

RPROVIDES:${PN} += "reveng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
