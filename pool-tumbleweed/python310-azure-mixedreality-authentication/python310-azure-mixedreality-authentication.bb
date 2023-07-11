SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mixedreality-authentication-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "dada006e6ba9c25a040fdfcd7d2737ffbbbfdcf7dcced80527a2bd643b3c013dcfbd521a68306846898b8c5728146686e89de5a66939af7a6440f0c7abc9682a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mixedreality-authentication \
python310-azure-mixedreality-authentication \
python3dist-azure-mixedreality-authentication"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-mixedreality-nspkg \
python310-msrest"

inherit rpm
