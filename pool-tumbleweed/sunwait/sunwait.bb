SUMMARY = "Sunrise, sunset and twilight calculator"
DESCRIPTION = "Sunwait is a small C program for calculating sunrise and sunset, as well as \
civil, nautical, and astronomical twilights. It has features that make it \
useful for home automation tasks."
LICENSE = "GPL-2.0-or-later"

PV = "20220613"

RPM_NAME = "sunwait-20220613-1.3.aarch64.rpm"
RPM_HASH = "9e93a4d4db3cd99cb72d5fa4ece1965a4e0a6e287357d62d0c3a747bfd87e553c0b6dd05049a0ea3a3c83d7bad871592bf7d6dd69a558ce3a90329bb21314aa6"

RPROVIDES:${PN} += "sunwait"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
