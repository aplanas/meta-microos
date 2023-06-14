SUMMARY = "Python implementation of the Happy Eyeballs Algorithm described in RFC 6555"
DESCRIPTION = "This module provided with a single file and dead-simple API for RFC 6555 \
'Happy Eyeballs: Success with Dual-Stack Hosts' \
<https://tools.ietf.org/html/rfc6555> to allow easy vendoring and \
integration into other projects."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-rfc6555-0.1.0-1.5.noarch.rpm"
RPM_HASH = "e44c04f43f5e5ad9f53f69750f547654c41d519f5f8377889ba0f842638ebcfe3bf8d30cf3f16731d7ffad205cb252b501a8e9831180646b4337a1c3eea5485e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rfc6555 \
python311-rfc6555 \
python3dist-rfc6555"

RDEPENDS:${PN} += "python-abi"

inherit rpm
