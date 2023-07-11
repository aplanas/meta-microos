SUMMARY = "Sunrise, sunset and twilight calculator"
DESCRIPTION = "Sunwait is a small C program for calculating sunrise and sunset, as well as \
civil, nautical, and astronomical twilights. It has features that make it \
useful for home automation tasks."
LICENSE = "GPL-2.0-or-later"

PV = "20220613"

RPM_NAME = "sunwait-20220613-1.4.aarch64.rpm"
RPM_HASH = "1fc2eb336fd5a58a5fb7d416d1cb944d34518f6b123282f436e632f9607eb1409a3fd98a1379e02831fe19d3af5a901e87711f75dff1afec9ecd0de0f1eae07c"

RPROVIDES:${PN} += "sunwait"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
