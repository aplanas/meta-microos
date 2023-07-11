SUMMARY = "Python implementation of the Happy Eyeballs Algorithm described in RFC 6555"
DESCRIPTION = "This module provided with a single file and dead-simple API for RFC 6555 \
'Happy Eyeballs: Success with Dual-Stack Hosts' \
<https://tools.ietf.org/html/rfc6555> to allow easy vendoring and \
integration into other projects."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-rfc6555-0.1.0-1.7.noarch.rpm"
RPM_HASH = "dcfbe4b3acf02498f78d83a0c1a21f0b6bec955e68b72f5830c059f55efd0ab36bf67b661b0f0f228856b1c431188a408ec03a4fcf589622bf6296f4558b4440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rfc6555 \
python310-rfc6555 \
python3dist-rfc6555"

RDEPENDS:${PN} += "python-abi"

inherit rpm
