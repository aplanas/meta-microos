SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python311-hcloud-1.28.0-1.1.noarch.rpm"
RPM_HASH = "a237e4fe39112eb433ddcfa1f452a609b10ecec8603a0d03c4f39d98a925208d9f63528c2cbc62b835a9feeb78cc460a4e213b9f6f246150b4ac8a795d476077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hcloud \
python3.11dist-hcloud \
python311-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil \
python311-requests"

inherit rpm
