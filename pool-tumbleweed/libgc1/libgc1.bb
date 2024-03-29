SUMMARY = "A garbage collector for C and C++"
DESCRIPTION = "The Boehm-Demers-Weiser conservative garbage collector can be used as a \
garbage collecting replacement for C malloc or C++ new. It allows you \
to allocate memory basically as you normally would, without explicitly \
deallocating memory that is no longer useful. The collector \
automatically recycles memory when it determines that it can no longer \
be otherwise accessed."
LICENSE = "BSD-3-Clause"

PV = "8.2.4"

RPM_NAME = "libgc1-8.2.4-1.1.aarch64.rpm"
RPM_HASH = "9fe927d428d146c9c1129ce1a26dd9228640cff5d71ea25c9c58ff41d817fd9f1c914d237f14913d84c4814fd860b40fdd95559013d05429ad340ed9cc517233"

RPROVIDES:${PN} += "libcord.so.1 \
libgc.so.1 \
libgc1 \
libgccpp.so.1 \
libgctba.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
