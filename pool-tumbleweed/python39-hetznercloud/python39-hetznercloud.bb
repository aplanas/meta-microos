SUMMARY = "Hetzner Cloud SDK"
DESCRIPTION = "A Python 3 SDK for the Hetzner cloud service."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-hetznercloud-1.1.1-3.12.noarch.rpm"
RPM_HASH = "b3a694807182e4066d9269a7f47e6736c13f8dcc1aa816c4672229c72bb0ceb61dbaf59206c7ce7322e2920f50afc5088698a9f2b517cdadbade65be05c16b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hetznercloud \
python39-hetznercloud \
python3dist-hetznercloud"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
