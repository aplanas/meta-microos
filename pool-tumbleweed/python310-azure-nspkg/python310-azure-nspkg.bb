SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-azure-nspkg-3.0.2-3.10.noarch.rpm"
RPM_HASH = "2744927b865b0808e8b6683805efcb528951d38c122a06786703c943388afb20dbde61b6bd31883624491d4a57b33c2fed09890a92cf0e71fe06d9e375ff3901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-nspkg \
python310-azure-nspkg \
python3dist-azure-nspkg"

RDEPENDS:${PN} += ""

inherit rpm
