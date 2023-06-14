SUMMARY = "Finite state machine compiler"
DESCRIPTION = "Ragel compiles finite state machines from regular languages into \
executable C, C++, Objective-C, or D code. Ragel state machines can \
not only recognize byte sequences as regular expression machines do, \
but can also execute code at arbitrary points in the recognition of a \
regular language. Code embedding is done using inline operators that \
do not disrupt the regular language syntax."
LICENSE = "MIT"

PV = "7.0.4"

RPM_NAME = "ragel-7.0.4-1.10.aarch64.rpm"
RPM_HASH = "4ec8e0e0ff2a6573055e6ef5ec66653111642f2ebdca37abe26e1e589791c27ece0ccec5e54a1b2b736bca3886d8236c01d5be67474cb4bbe4c8c0754109efdf"

RPROVIDES:${PN} += "libragel.so.0 \
ragel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcolm-0.14.7.so \
libfsm-0.14.7.so \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
