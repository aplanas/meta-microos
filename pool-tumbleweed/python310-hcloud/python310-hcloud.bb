SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python310-hcloud-1.28.0-1.1.noarch.rpm"
RPM_HASH = "2403b522788b8f611636cf5fdf88f256d967d4d279da22d42f4cf0d05aaaf20a89a7c1b09014b57a9de27cbec0462e9765050a12a1f3842fa7304258b1ad36e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hcloud \
python310-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-requests"

inherit rpm
