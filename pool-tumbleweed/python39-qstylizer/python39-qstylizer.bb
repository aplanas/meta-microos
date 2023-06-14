SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-qstylizer-0.2.2-1.3.noarch.rpm"
RPM_HASH = "458edf71feb5d4af305d7926ad524bfe44b463c8cc4be7eaf4202c870fafbfe5110ceb0353000da87811e1f235c53bd35d681dc27650dbe76d5b0e593321ab3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qstylizer \
python39-qstylizer \
python3dist-qstylizer"

RDEPENDS:${PN} += "python-abi \
python39-inflection \
python39-tinycss2"

inherit rpm
