SUMMARY = "Hetzner Cloud SDK"
DESCRIPTION = "A Python 3 SDK for the Hetzner cloud service."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-hetznercloud-1.1.1-3.12.noarch.rpm"
RPM_HASH = "22c8788df10006b230f5ca39a7ed8a12ef0d85aae224b3cb9a0055db20b7670ed2ca904149c10162b52dc9d2187a626b61365daa44f72c5e41f4726d15371561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hetznercloud \
python310-hetznercloud \
python3dist-hetznercloud"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
