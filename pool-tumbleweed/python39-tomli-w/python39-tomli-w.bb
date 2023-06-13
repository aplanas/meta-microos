SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-tomli-w-1.0.0-3.1.noarch.rpm"
RPM_HASH = "56945860276618e8603cbda1e3fb3ecc2f1e979ed7c991d361f46924a1427a73b955224880b7d752bbdb1cdaeece829bf83cd716dc3afde36b17f8a9a5ed4d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tomli-w) \
python39-tomli-w \
python3dist(tomli-w)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
