SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-azure-nspkg-3.0.2-3.10.noarch.rpm"
RPM_HASH = "59bcc0746585bc8436e59674f188f915421a0108e3540fb6afadd2ff58b2f20e7ff57e50b17a71e890f378d352878d2e368629d24b096ac845f75589dc98e267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-nspkg \
python39-azure-nspkg \
python3dist-azure-nspkg"

RDEPENDS:${PN} += ""

inherit rpm
