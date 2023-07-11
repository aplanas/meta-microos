SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python311-pip-licenses-4.3.2-1.3.noarch.rpm"
RPM_HASH = "8c01a41866f7f2ac25a4a5534b7db844506941d55b6bc3326f4f32ec708a7ae459ac2a80c88170e1a4d0a5a5a8aa228ae8f6eb9944ea88c5de379e1e14602390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-licenses \
python3.11dist-pip-licenses \
python311-pip-licenses \
python3dist-pip-licenses"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PrettyTable \
python311-pip \
update-alternatives"

inherit rpm
