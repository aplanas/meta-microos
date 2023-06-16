SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-user_agent-0.1.10-1.4.noarch.rpm"
RPM_HASH = "d107322e14f68ea54b74464148141774a2ac5bf177fdc00932c3cdc24d6b100e45277e25f3fe853be741fc2e4d36a7b5007c46db1cf2018af3d64e9e942b77e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-user-agent \
python39-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
