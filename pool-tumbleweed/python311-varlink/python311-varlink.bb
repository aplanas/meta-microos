SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python311-varlink-31.0.0-2.1.noarch.rpm"
RPM_HASH = "ba6fa153eb1ac3d1b150b30d41308554aacd9e421550d60cccee9f282485b5693994c7d35ed6d03015fb68fda22b28980912f86db4a649e796f088c4c9bcbea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varlink \
python3.11dist-varlink \
python311-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi"

inherit rpm
