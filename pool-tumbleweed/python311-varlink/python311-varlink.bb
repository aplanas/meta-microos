SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python311-varlink-31.0.0-1.8.noarch.rpm"
RPM_HASH = "40d45f22cb0f3b8fe731580c89cd2da41af08b382be3287c98d91102069661588f64bd8cd322f6e6f0df806f505108893433cfc1bc28173f49972a90547d8688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varlink \
python3.11dist-varlink \
python311-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python311-future"

inherit rpm
