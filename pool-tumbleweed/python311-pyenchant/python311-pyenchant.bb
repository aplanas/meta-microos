SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python311-pyenchant-3.2.2-1.10.noarch.rpm"
RPM_HASH = "91cf4a3cee6562eb6c5c840d33676cd3c90f1f67d7f6cd1b84eee68caaaf4351f63189ec48c2c56d96b0e08a4d90f96e729bca0ede8d1447aa8e48e2abfa95c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enchant \
python3-pyenchant \
python3.11dist-pyenchant \
python311-enchant \
python311-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
