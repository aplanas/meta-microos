SUMMARY = "The Colm programming language runtime"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "libfsm-0_14_7-0.14.7-2.5.aarch64.rpm"
RPM_HASH = "165a2aa0b95bca0022e98eb28392ecc26703d035e195da21b8b370af37f9688363d69534d8ef96c8153feef08ced7245f21a2486197cace79555581be438b89f"

RPROVIDES:${PN} += "libfsm-0-14-7 \
libfsm-0.14.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
