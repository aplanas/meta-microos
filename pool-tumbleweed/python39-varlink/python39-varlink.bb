SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python39-varlink-31.0.0-2.1.noarch.rpm"
RPM_HASH = "a0d3d7f5c2c44dfbd1352e64d426b0b511a98aa8b0521d2a36cbf5158cac7863a5139d093028df8e8ddbc1a7ecc17031c2e34418dac5e2d2dab98517c99f80c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-varlink \
python39-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi"

inherit rpm
