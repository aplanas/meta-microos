SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "python311-plette-0.4.4-1.5.noarch.rpm"
RPM_HASH = "d22bd23c2cf7e50c73fd674cd5ba3b2b1767673bfe00008754da2c7222750ec567f8886dc99dacfa9f1e3fe16fdcf07558d0ef13440f6c760747ae6884afba2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plette \
python3.11dist-plette \
python311-plette \
python3dist-plette"

RDEPENDS:${PN} += "python-abi \
python311-tomlkit"

inherit rpm
