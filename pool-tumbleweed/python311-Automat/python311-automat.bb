SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Automat-22.10.0-2.1.noarch.rpm"
RPM_HASH = "a1e6a8143f947d14df157338b5d5329b18aa34b0032e60251f67f2cb42087bd58a2a24737331ecfc8ddf7d9e5ff0726e310e3c9d19614cf240778eb1aec9f9f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-automat \
python311-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-attrs \
update-alternatives"

inherit rpm
