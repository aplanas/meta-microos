SUMMARY = "Extra tools for the Allegro programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. This package contains extra \
tools which are useful for developing Allegro programs."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-tools-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "6cdf2ba49f15404064f2f781c48f999a2b76c2cd90d30efd329158f1b6eed73cf8ce08f98b201651463e96c2ed56b268460a3a24be0a6b58a7a8bdc10063d379"

RPROVIDES:${PN} += "allegro44-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libjpgalleg.so.4.4 \
libm.so.6"

inherit rpm
