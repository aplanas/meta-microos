SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python39-hcloud-1.17.0-1.4.noarch.rpm"
RPM_HASH = "7abfede6603600b96ee2726352e6095dc570e46e1095404f29b2c1a9753127319bfab60c6c68fa8c019b795ac4c8bea149c72d3da6653fbc2fe4603baa080418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hcloud) \
python39-hcloud \
python3dist(hcloud)"
RDEPENDS:${PN} += "python(abi) \
python39-future \
python39-python-dateutil \
python39-requests"

inherit rpm
