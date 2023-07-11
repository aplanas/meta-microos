SUMMARY = "Backports of the linecache module"
DESCRIPTION = "A backport of linecache to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python39-linecache2-1.0.0-6.3.noarch.rpm"
RPM_HASH = "3c840b0a9abf94879f44d5a7c95761c2698094a11ee549398e3ef5bc478d57a3eabf136b11215b07366431bc2a607a32ada9653f18e5fc8bdd5bf6e69208aca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-linecache2 \
python39-linecache2 \
python3dist-linecache2"

RDEPENDS:${PN} += "python-abi \
python39-pbr"

inherit rpm
