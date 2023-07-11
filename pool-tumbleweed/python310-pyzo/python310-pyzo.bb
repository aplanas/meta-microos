SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python310-pyzo-4.11.2-1.14.noarch.rpm"
RPM_HASH = "a9e4d957f43e843282d4052e165fe063fd0e59400ad5f73d5b38c94fe0ebdb5861f8abe32608606a48a5fef19180594531fe1316783a609a7a6075f1992d74f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyzo \
python310-pyzo \
python3dist-pyzo"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
python310-qt5 \
pyzologo"

inherit rpm
