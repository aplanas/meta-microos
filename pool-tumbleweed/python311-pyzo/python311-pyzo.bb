SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python311-pyzo-4.11.2-1.14.noarch.rpm"
RPM_HASH = "cb1707a1a17c24219e83a220b54d89aadd31a5f3385bb1545af7c309bea2d20dacb1be38de61884b14f1adb5bd5f519b1183f515227e2ac6c5b78e255ed6a087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyzo \
python3.11dist-pyzo \
python311-pyzo \
python3dist-pyzo"

RDEPENDS:${PN} += "/usr/bin/env \
hicolor-icon-theme \
python-abi \
python311-qt5 \
pyzologo"

inherit rpm
