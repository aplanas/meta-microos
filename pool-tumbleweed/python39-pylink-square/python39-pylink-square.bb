SUMMARY = "Python interface for SEGGER J-Link"
DESCRIPTION = "Python interface for SEGGER J-Link."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python39-pylink-square-1.1.0-1.1.noarch.rpm"
RPM_HASH = "94b3774f7d13cd7bf640f4ac637b05473bd97d22f6204c8e92889a062c8f4edda09ff2cf4fbe494d9ba1e080bc1e7c79ecb6355d5270994a267eadd98da613b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylink-square \
python39-pylink-square \
python3dist-pylink-square"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-psutil \
python39-six \
update-alternatives"

inherit rpm
