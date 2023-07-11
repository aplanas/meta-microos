SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python310-hcloud-1.17.0-1.6.noarch.rpm"
RPM_HASH = "5915b02065daebf5ac936e73110ba66c545e412790c06b63fc2323150eae778aab8f1189a4e2e06d1f65a6497b19e9799cae90ec53f06efdd86ae0210562f06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hcloud \
python310-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-python-dateutil \
python310-requests"

inherit rpm
