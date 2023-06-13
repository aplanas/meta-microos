SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python39-tap.py-3.1-1.6.noarch.rpm"
RPM_HASH = "da04faf9086c11782838ef3e88fa0d899dc5a0a2c7d6831c481597e9da84a3ca0c58343a97732cbc7caffc74b5c518f58f6333275591593e93e89a4437e7c71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tap.py) \
python39-tap.py \
python3dist(tap.py)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
