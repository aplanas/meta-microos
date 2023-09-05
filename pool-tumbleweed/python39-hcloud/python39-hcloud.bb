SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python39-hcloud-1.28.0-1.1.noarch.rpm"
RPM_HASH = "d0f8431ef815a76115ffc85da2cb4de58f2ddcc757be938ec0a8f83cf8775b6711440dcd5aeddbbf692bdba13ba87e1984a04198e1172b9cf7022bb7e6b586a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hcloud \
python39-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
python39-requests"

inherit rpm
