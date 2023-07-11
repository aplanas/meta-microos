SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python310-varlink-31.0.0-1.8.noarch.rpm"
RPM_HASH = "b08f2d289ca83797c2176ce62443830a2c59a767ce86a36bb2e552be73e2d3bc823bf890390cb6c79a455302e2da4651008bac1e603298e19f805eb251e48b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-varlink \
python310-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python310-future"

inherit rpm
