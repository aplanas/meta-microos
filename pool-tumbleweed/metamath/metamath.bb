SUMMARY = "Formal proof verifier and proof assistant"
DESCRIPTION = "The Metamath language is a language to write theorems and formal proofs for \
them. The Metamath program can parse files in the Metamath language and verify \
the proofs. You can find examples of theories developed in Metamath on the \
website."
LICENSE = "GPL-2.0-or-later"

PV = "0.198"

RPM_NAME = "metamath-0.198-7.7.aarch64.rpm"
RPM_HASH = "8867383ed9cf4db31bfbc2fba1ed5c25419881d571f1b4bd6bb3766132d26ff22b89f2cfc56c5fffc192b7b7c56c09268924528d3de3926f3c96d4b78757ac05"

RPROVIDES:${PN} += "metamath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
