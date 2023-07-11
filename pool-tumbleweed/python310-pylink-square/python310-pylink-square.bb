SUMMARY = "Python interface for SEGGER J-Link"
DESCRIPTION = "Python interface for SEGGER J-Link."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python310-pylink-square-1.1.0-1.1.noarch.rpm"
RPM_HASH = "82c95ce11a2abb20b30e23e9813bf9ff8f3fa72695c9a0a0a4b10f16a68289892dfd62e8b62c65ca747860f5cfb0c63e437cdfa2ccde9a36610cf90750bc556a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylink-square \
python310-pylink-square \
python3dist-pylink-square"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-psutil \
python310-six \
update-alternatives"

inherit rpm
