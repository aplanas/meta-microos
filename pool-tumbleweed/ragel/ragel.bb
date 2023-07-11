SUMMARY = "Finite state machine compiler"
DESCRIPTION = "Ragel compiles finite state machines from regular languages into \
executable C, C++, Objective-C, or D code. Ragel state machines can \
not only recognize byte sequences as regular expression machines do, \
but can also execute code at arbitrary points in the recognition of a \
regular language. Code embedding is done using inline operators that \
do not disrupt the regular language syntax."
LICENSE = "MIT"

PV = "7.0.4"

RPM_NAME = "ragel-7.0.4-1.11.aarch64.rpm"
RPM_HASH = "87569b2e96805af8117ead64994cc6100dbc2ac35b852f3691db9a6e238eae82a4352d5d2e6c8e31a076ff40122e1a3cb1059d224f81b0a0c833763762339e4e"

RPROVIDES:${PN} += "libragel.so.0 \
ragel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcolm-0.14.7.so \
libfsm-0.14.7.so \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
