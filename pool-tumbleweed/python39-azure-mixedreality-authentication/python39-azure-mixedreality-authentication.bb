SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mixedreality-authentication-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "88b7005656e9037f11baac31e02cf49af05ca8cd61757548891a97a907c7798a998d220319adab8b4fe309bf5cdd0a358d86db408d074ee759c0db934b145a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mixedreality-authentication \
python39-azure-mixedreality-authentication \
python3dist-azure-mixedreality-authentication"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-mixedreality-nspkg \
python39-msrest"

inherit rpm
