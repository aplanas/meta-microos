SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-pytest-plus-0.4.0-1.1.noarch.rpm"
RPM_HASH = "b665860f8c07d2112eee1afaf2e37fa417585fdd72d3a3814e6496102befe462f3695045ac263b93dc7363c17a81f9530331ef9c5943d1277327dd00f22bd398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-plus \
python311-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
