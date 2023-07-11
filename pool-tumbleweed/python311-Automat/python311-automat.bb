SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Automat-22.10.0-2.3.noarch.rpm"
RPM_HASH = "c75b2c6eecc8cb50ed989b3d20b31c9d65459f506e7789b39f789a447c96169d46440d2b3c60bdfea4a5f60189aaff1ee79bb0edde17d6752ffd42643660ca1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Automat \
python3.11dist-automat \
python311-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
update-alternatives"

inherit rpm
