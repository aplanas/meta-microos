SUMMARY = "Python implementation of the Happy Eyeballs Algorithm described in RFC 6555"
DESCRIPTION = "This module provided with a single file and dead-simple API for RFC 6555 \
'Happy Eyeballs: Success with Dual-Stack Hosts' \
<https://tools.ietf.org/html/rfc6555> to allow easy vendoring and \
integration into other projects."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-rfc6555-0.1.0-1.7.noarch.rpm"
RPM_HASH = "2718c068025fab4fe5ff47e3d78703c51e41244704382cfaf4ac46f0a8361a7185a56f0c9f0f7571c86af915d5996e796cb887a078705334711164742d9ed00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rfc6555 \
python39-rfc6555 \
python3dist-rfc6555"

RDEPENDS:${PN} += "python-abi"

inherit rpm
