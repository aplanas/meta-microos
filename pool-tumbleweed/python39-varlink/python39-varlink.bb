SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python39-varlink-31.0.0-1.8.noarch.rpm"
RPM_HASH = "c83f200fa6b031440e6aaaa65ca45f668d3dd51f70707e11b5861b23e967467a034322f1f39ec549439d3abd2cc7960833711cf7c624f54ac04a0020468b2c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-varlink \
python39-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python39-future"

inherit rpm
