SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-azure-mgmt-nspkg-3.0.2-3.10.noarch.rpm"
RPM_HASH = "c2403238e76b668e4c4eaf311e40539e5ab12e296b04ac8e589a139516158c51eda1496a691b8e0c458d6ba15554a0cadf5b986271a22ade5358590d67303369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-nspkg \
python39-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
