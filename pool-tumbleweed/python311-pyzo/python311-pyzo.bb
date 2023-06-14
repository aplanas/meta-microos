SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python311-pyzo-4.11.2-1.12.noarch.rpm"
RPM_HASH = "bd5298096c4e43cd1c51c5e18b38225cf6fed0615d158260693e5149f31ff0499c34c83d6969da5da7f93b7ba99a536b07a6c3f4a4944acef26966d693502ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyzo \
python311-pyzo \
python3dist-pyzo"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
python311-qt5 \
pyzologo"

inherit rpm
