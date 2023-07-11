SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python39-hcloud-1.17.0-1.6.noarch.rpm"
RPM_HASH = "df4c354ffc3a53fe8920b21de0083dd3a9f3fd1eeccef4662421869af29580296e306a8f474bfedd9d7e6089478483bd90522b40dada66a4b6190ddc059f8151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hcloud \
python39-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-python-dateutil \
python39-requests"

inherit rpm
