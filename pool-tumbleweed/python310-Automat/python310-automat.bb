SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Automat-22.10.0-2.3.noarch.rpm"
RPM_HASH = "ccb22af13426d7f71c65267295d6e1768583c3c77415147f3e27fbf1bdf22d46378c9ea759e833c4aa84437e848dea7e7839e68bb4a69840757128035f613068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-automat \
python310-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
update-alternatives"

inherit rpm
