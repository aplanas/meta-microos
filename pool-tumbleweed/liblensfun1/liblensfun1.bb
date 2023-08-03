SUMMARY = "Library files for lensfun"
DESCRIPTION = "Library files needed by the use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "liblensfun1-0.3.4-1.1.aarch64.rpm"
RPM_HASH = "71c9c2137ee0e9bb144183e0ea29ec5dd44a6be872eb4f51efa733c857f330ae7f7e81013fa91f4d86870f3e4b85ea070e799c7838a8695a9bb10c8fede34bc2"

RPROVIDES:${PN} += "lensfun \
liblensfun.so.1 \
liblensfun1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
lensfun-data \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
