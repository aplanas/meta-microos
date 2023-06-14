SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python311-rfc3987-1.3.8-5.1.noarch.rpm"
RPM_HASH = "3fe3a3fe51e63ebf50dfea4cf88284199f1efd5f648a4b647a9f05f421fa7e06927316e27c0d37bd6213ac7b09b0736e1726fa4760942b0e69bb09e00fe4340f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rfc3987 \
python311-rfc3987 \
python3dist-rfc3987"

RDEPENDS:${PN} += "python-abi"

inherit rpm
