SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Automat-22.10.0-2.3.noarch.rpm"
RPM_HASH = "b4e2c84fcdaa78a20c316547c7ad5aef52e25fd073bcfca9ac235b62b8bcfb161016e070ee04d4b28ab14a17e3eddb30f7850dca72bb0011724099711cecc234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-automat \
python39-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
update-alternatives"

inherit rpm
