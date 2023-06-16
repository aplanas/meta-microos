SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python311-gear-0.16.0-1.4.noarch.rpm"
RPM_HASH = "25269a7471a4b533a00e4490c584018615625c29f7a9ff63323a2f0ef9d5642a5fbd13eeacbbbe34359b0e88a6fea3ca62c4a8cb04f22a3ac35f67389f6e95be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gear \
python311-gear \
python3dist-gear"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-extras \
python311-pbr \
python311-python-daemon \
python311-six \
update-alternatives"

inherit rpm
