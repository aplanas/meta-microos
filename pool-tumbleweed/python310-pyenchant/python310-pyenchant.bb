SUMMARY = "Python bindings for the Enchant spellchecking system"
DESCRIPTION = "PyEnchant is a spellchecking library for Python, based on the excellent Enchant library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python310-pyenchant-3.2.2-1.8.noarch.rpm"
RPM_HASH = "0625dd58bd40b69d4602896eca5b7d69f232c761fd3111cac52a405cb2a73e60a34d6e5f6a483740d1e3a22b33db8515872977fe0a5db5226f7e76fd01d33bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enchant \
python3-pyenchant \
python3.10dist-pyenchant \
python310-enchant \
python310-pyenchant \
python3dist-pyenchant"

RDEPENDS:${PN} += "enchant-2-backend-hunspell \
python-abi"

inherit rpm
