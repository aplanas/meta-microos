SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-azure-mgmt-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "30e5832511667b8fbbdf3983a153ae484932ac491054166411b64c52fc06432a1b0305a4f46924d3d9418ccf5db3cd96263ee3ef043661d95254cb31af4ac646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-nspkg) \
python39-azure-mgmt-nspkg \
python3dist(azure-mgmt-nspkg)"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
