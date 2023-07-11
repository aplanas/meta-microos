SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-azure-mgmt-nspkg-3.0.2-3.10.noarch.rpm"
RPM_HASH = "7ddad647577754062f50b5f743c14225d9490672375acfd7a43635a2032ec4668fb7ebec8a731b859a05e5dc289d30426b63dd1466898e3f093e427a553419da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-nspkg \
python3.11dist-azure-mgmt-nspkg \
python311-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
