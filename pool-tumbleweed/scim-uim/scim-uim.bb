SUMMARY = "UIM Input Method Engine for SCIM"
DESCRIPTION = "UIM Input Method Engine for SCIM. \
 \
 \
 \
Authors: \
-------- \
    James Su <suzhe@tsinghua.org.cn>"
LICENSE = "GPL-2.0+"

PV = "0.2.0"

RPM_NAME = "scim-uim-0.2.0-225.27.aarch64.rpm"
RPM_HASH = "e77ddd41985603b4c03abc2d7aab9e31fce8f994b946d506b407596a2672565fb49517e6e3634ba937b4716c75cbbdf76b7ae79f06aedf5dddc4e5c57cc7617a"

RPROVIDES:${PN} += "scim-uim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscim-1.0.so.8 \
libstdc++.so.6 \
libuim-scm.so.0 \
libuim.so.8"

inherit rpm
