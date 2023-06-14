SUMMARY = "Formal proof verifier and proof assistant"
DESCRIPTION = "The Metamath language is a language to write theorems and formal proofs for \
them. The Metamath program can parse files in the Metamath language and verify \
the proofs. You can find examples of theories developed in Metamath on the \
website."
LICENSE = "GPL-2.0-or-later"

PV = "0.198"

RPM_NAME = "metamath-0.198-7.6.aarch64.rpm"
RPM_HASH = "475285e20d17181ab70d67cf1cba6c01504c9632d384bca9037ee33e34f582bf36992b540e2ce91081995e99f91e1e4d3d93c15f099e6b94c6a46d40201d7129"

RPROVIDES:${PN} += "metamath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
