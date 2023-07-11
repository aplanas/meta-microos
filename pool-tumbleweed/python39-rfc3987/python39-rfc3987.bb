SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python39-rfc3987-1.3.8-5.3.noarch.rpm"
RPM_HASH = "a198d4247dd169f1e4dcdee9e5af176251d79788615af0e890bee36b07647039995e226209e4154811bb46c093afe6c6b000fd9a0db3cbe71df01aa3b40c8fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rfc3987 \
python39-rfc3987 \
python3dist-rfc3987"

RDEPENDS:${PN} += "python-abi"

inherit rpm
