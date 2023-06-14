SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Automat-22.10.0-2.1.noarch.rpm"
RPM_HASH = "607f5877687ad979dde3290f59401a4e95b6f4840bc565204feffb91b194336a7806d5efd8ade43d92acfbddb9e8479d5bcefbda1607f21a659e4690f40097df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-automat \
python39-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-attrs \
update-alternatives"

inherit rpm
