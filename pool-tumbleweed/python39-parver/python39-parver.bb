SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-parver-0.4-1.2.noarch.rpm"
RPM_HASH = "57cb19e5ea6dacb361e9d92efaa71643b938340c31dfbf810684246915e07986e7a8fc3ed9a508fd16f4854389f983b79e1730c1ceecbf08efa5528dea70496b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parver) \
python39-parver \
python3dist(parver)"

RDEPENDS:${PN} += "python(abi) \
python39-Arpeggio \
python39-attrs \
python39-typing_extensions"

inherit rpm
