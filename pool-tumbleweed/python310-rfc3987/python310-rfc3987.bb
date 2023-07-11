SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python310-rfc3987-1.3.8-5.3.noarch.rpm"
RPM_HASH = "b26be8a8c27608e447b4b0b22e9bb6b987f719d47e1944bf5557478200de346fef9e47ae3a6a83f7342090af81c274c49907221e7a210551473cbb769eaf19bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rfc3987 \
python310-rfc3987 \
python3dist-rfc3987"

RDEPENDS:${PN} += "python-abi"

inherit rpm
