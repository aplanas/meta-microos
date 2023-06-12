SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-tomli-w-1.0.0-3.1.noarch.rpm"
RPM_HASH = "2602ee172c003926a1447e0e6e88e1677d1680c54618087aee5ea4b0ceb3b3374e681675ff91f92576fc229b6069629fe69584343ee7a215d2233c2faeb53bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomli-w \
python3.10dist(tomli-w) \
python310-tomli-w \
python3dist(tomli-w)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
