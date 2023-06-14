SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python311-hcloud-1.17.0-1.4.noarch.rpm"
RPM_HASH = "073341cc521217e20799ee1261593d64d83b368394feeae6ea8e94c9c6328b6a21f45b9208fb0702244a402b348f9be1acb0ac68403bd2bc8bad3f7a5b496ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-hcloud \
python311-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-python-dateutil \
python311-requests"

inherit rpm
