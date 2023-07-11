SUMMARY = "Python implementation of the Happy Eyeballs Algorithm described in RFC 6555"
DESCRIPTION = "This module provided with a single file and dead-simple API for RFC 6555 \
'Happy Eyeballs: Success with Dual-Stack Hosts' \
<https://tools.ietf.org/html/rfc6555> to allow easy vendoring and \
integration into other projects."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-rfc6555-0.1.0-1.7.noarch.rpm"
RPM_HASH = "a950a18837a6a139a2130f4d6bc19ea3c31b7e3ea259413b5982a9f14192f0e7d4066374f76bfaf024f0491259563189cd8d5ee5ed5dff55e97d8f0d9952ea3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc6555 \
python3.11dist-rfc6555 \
python311-rfc6555 \
python3dist-rfc6555"

RDEPENDS:${PN} += "python-abi"

inherit rpm
