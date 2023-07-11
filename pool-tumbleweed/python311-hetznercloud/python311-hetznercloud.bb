SUMMARY = "Hetzner Cloud SDK"
DESCRIPTION = "A Python 3 SDK for the Hetzner cloud service."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-hetznercloud-1.1.1-3.12.noarch.rpm"
RPM_HASH = "f72a911279a3eca245c319fe8bc12a4efbafbd77b47a9aa7dcb766b25fee72e4d09f0516d057baff9f00c68c03abbc3000dd33abcf1e1b6e039edf5962b489a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hetznercloud \
python3.11dist-hetznercloud \
python311-hetznercloud \
python3dist-hetznercloud"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
