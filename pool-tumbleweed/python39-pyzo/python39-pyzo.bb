SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python39-pyzo-4.11.2-1.14.noarch.rpm"
RPM_HASH = "6815a1f0769c6d0cb1a19b1ec5e677d88366b6bff27d26716c20f699901d7a539930be499603e736b89d3f761d866b29aa5d2231296af70b6fd612d4905f5ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyzo \
python39-pyzo \
python3dist-pyzo"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
python39-qt5 \
pyzologo"

inherit rpm
