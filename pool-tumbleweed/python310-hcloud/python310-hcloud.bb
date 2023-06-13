SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python310-hcloud-1.17.0-1.4.noarch.rpm"
RPM_HASH = "0bbd68ce89d4bae1822dde269f0124b9506a37586d1790e0e3f90e1f504a5ee9c8d3655ff4213e1a0b06d9b53837b63c9625bd23cff979c5b980b263fe333968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hcloud \
python3.10dist(hcloud) \
python310-hcloud \
python3dist(hcloud)"

RDEPENDS:${PN} += "python(abi) \
python310-future \
python310-python-dateutil \
python310-requests"

inherit rpm
