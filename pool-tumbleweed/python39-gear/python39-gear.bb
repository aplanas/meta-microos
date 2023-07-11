SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python39-gear-0.16.0-1.6.noarch.rpm"
RPM_HASH = "8e278da7bbaa576a1a3587bdc566b5c09b5e167fa61bf8bc1358a2371dc28e65ba77a70365a6456657b248ba3b93473f82c99b833daf3fbbafc929933c147aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gear \
python39-gear \
python3dist-gear"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-extras \
python39-pbr \
python39-python-daemon \
python39-six \
update-alternatives"

inherit rpm
