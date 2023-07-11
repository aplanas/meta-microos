SUMMARY = "Mifare Classic Offline Cracker: key recovery tool for MC cards"
DESCRIPTION = "MFOC is a tool to recover keys from Mifare Classic cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.7+git38"

RPM_NAME = "mfoc-0.10.7+git38-1.15.aarch64.rpm"
RPM_HASH = "5ee366848566cd6dd8b380cf1c16113b5c2285d5e73455463cf6d09787884a658371b904391d162de7f34bd5bbc33aabbd7bf81994597585cf0bee55ff6cfb43"

RPROVIDES:${PN} += "mfoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6"

inherit rpm
