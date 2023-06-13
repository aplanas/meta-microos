SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python310-pyzo-4.11.2-1.12.noarch.rpm"
RPM_HASH = "03b0148b9f4c6dcf1a566e432ed5152bd8fc3a9e5755b2bf1f4556813526c3314776a3c0e3e3ee867d4ee69ca6c3fb7a305132e3871a9f874919cdd643e28ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyzo \
python3.10dist(pyzo) \
python310-pyzo \
python3dist(pyzo)"

RDEPENDS:${PN} += "/usr/bin/env \
hicolor-icon-theme \
python(abi) \
python310-qt5 \
pyzologo"

inherit rpm
