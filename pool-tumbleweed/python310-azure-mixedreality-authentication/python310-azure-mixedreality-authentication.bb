SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mixedreality-authentication-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "e2f19dbbdadc56caa7e01a9f439610596c717b271735dcd9c19a76542dc53cb95d457cd3da72d4d40882d1edd768002266f0adcd28d3be0acb506f10ea001ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mixedreality-authentication \
python3.10dist(azure-mixedreality-authentication) \
python310-azure-mixedreality-authentication \
python3dist(azure-mixedreality-authentication)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-mixedreality-nspkg \
python310-msrest"

inherit rpm
