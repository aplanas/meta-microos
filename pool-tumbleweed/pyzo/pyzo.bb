SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "pyzo-4.11.2-1.12.noarch.rpm"
RPM_HASH = "829df57a9b45273c61a1e5e27d55a236dfd6942260e3592735e0c53a47377d2ca7e881f6a8a984a5810690087d19404bdc0c9d4ce6bb2f7315c316cffd105db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(pyzo.desktop) \
mimehandler(text/x-python) \
pyzo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python3-pyzo"

inherit rpm
