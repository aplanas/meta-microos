SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python39-pyenchant-3.2.2-1.8.noarch.rpm"
RPM_HASH = "ecbeb21b3d1ec63717cdd8fa348a63633e14e2e7578791c657bbc18fe17657a35b715db6b29902f788d2e0f0eefe58389d26ef0c26445341cce611816201fa65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyenchant \
python39-enchant \
python39-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
