SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python311-taskw-2.0.0-1.5.noarch.rpm"
RPM_HASH = "6f2cfe30d3102619c428c3cd9b1d56c2baf18701635045403a446b2c26a91040ab8325bff4e9cc52a4c3ad3a65076339981d8e72c8fd3cd52c7937a35a01bbbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-taskw \
python3.11dist-taskw \
python311-taskw \
python3dist-taskw"

RDEPENDS:${PN} += "python-abi \
python311-kitchen \
python311-python-dateutil \
python311-pytz \
taskwarrior"

inherit rpm
