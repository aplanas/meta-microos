SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.0"

RPM_NAME = "python311-py-vapid-1.9.0-1.4.noarch.rpm"
RPM_HASH = "2cdd73b47f7a9bc3c9e355fc74d6a984fb7c27c909080f3ae09348539704d74b5f77f48756cc63b3d7b60eb148ea868714fe22c9fe6faa35b63705c2c62a31db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py-vapid) \
python311-py-vapid \
python3dist(py-vapid)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-cryptography \
update-alternatives"

inherit rpm
