SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python39-gear-0.16.0-1.4.noarch.rpm"
RPM_HASH = "132c7687c3db5cc86539af1aad6dfb06796cd214ac1dc3428cb072f3678e514f5e755e1c0b96507458042a538655db49fd4a5500f65fb5e4f52aa3bc03d4e01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gear) \
python39-gear \
python3dist(gear)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-extras \
python39-pbr \
python39-python-daemon \
python39-six \
update-alternatives"

inherit rpm
