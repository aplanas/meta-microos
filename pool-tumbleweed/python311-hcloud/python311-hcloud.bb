SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python311-hcloud-1.17.0-1.6.noarch.rpm"
RPM_HASH = "e78526ee700df7769e197a48893d334ea468f9271c62481689b24ffbebaa27f095f1a60fb019fd841bb5cbf1f42b872d5de3b33ba783800242a6013bb48ee9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hcloud \
python3.11dist-hcloud \
python311-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-python-dateutil \
python311-requests"

inherit rpm
