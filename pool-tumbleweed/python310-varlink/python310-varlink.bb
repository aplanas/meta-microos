SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python310-varlink-31.0.0-2.1.noarch.rpm"
RPM_HASH = "36ef52368433af75f7eec70da6a05bf82b8a021e4efb5f68af483765a01594e7809a4220ed5b706802838ed512a7cf3d245ebd6ea7d710e63db7c3ad95e0a277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-varlink \
python310-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi"

inherit rpm
