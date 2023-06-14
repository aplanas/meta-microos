SUMMARY = "Mifare Classic Offline Cracker: key recovery tool for MC cards"
DESCRIPTION = "MFOC is a tool to recover keys from Mifare Classic cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.7+git38"

RPM_NAME = "mfoc-0.10.7+git38-1.14.aarch64.rpm"
RPM_HASH = "3a78cf86535f9e7bac5e373c9a5c30a37bd883ac5d3f19fa619cbec38892e2d44eee57a31340b392b71e6219186e673363c8e42e1ed7fdb14640f6f7001af8b8"

RPROVIDES:${PN} += "mfoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6"

inherit rpm
