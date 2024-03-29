SUMMARY = "Character Set Converter"
DESCRIPTION = "Recode converts files between various character sets. \
It supports conversion to and from HTML entities as well."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.7.14"

RPM_NAME = "recode-3.7.14-1.1.aarch64.rpm"
RPM_HASH = "3ec84c0dc439dfc8d0e3cd760c1e1dadef0e644677c0e1e02a74c514db8bc9abce96bab136455b43ce5ab179b46581d383cc2fca77addae11fe0709b0ed23ef6"

RPROVIDES:${PN} += "recode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librecode.so.3"

inherit rpm
