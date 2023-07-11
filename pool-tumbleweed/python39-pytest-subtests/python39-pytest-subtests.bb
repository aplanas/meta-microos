SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-pytest-subtests-0.11.0-1.3.noarch.rpm"
RPM_HASH = "fef7efbe05f988ffe90e845473f1cc39a1e74dfa5dd539114db15d14333cc8b598d1bd647ceb9fe153c0bb209637da843da05c530c8e836e6c8e36ea9b669486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-subtests \
python39-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
