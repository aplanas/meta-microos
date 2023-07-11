SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python310-ana-0.06-3.5.noarch.rpm"
RPM_HASH = "ac5e4a0fa63933312a7e1dadf284ffc972824b837c60eef25e11e06e382c9b9b444928e64ee1374d83c1ecc2f1ecb8f394de903431477e62482a216a15bb4f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ana \
python310-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
