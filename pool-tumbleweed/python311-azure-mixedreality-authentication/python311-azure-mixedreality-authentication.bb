SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mixedreality-authentication-1.0.0b1-1.10.noarch.rpm"
RPM_HASH = "48cbca8e4803e3aeb4c8ea285d6ca15dfc9225abb8b3d102caa1029dc1250fef16a33675f8e75fd2a1112164b621f452843b32762e7eb8b0b21c04ada6da920d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mixedreality-authentication \
python3.11dist-azure-mixedreality-authentication \
python311-azure-mixedreality-authentication \
python3dist-azure-mixedreality-authentication"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-mixedreality-nspkg \
python311-msrest"

inherit rpm
