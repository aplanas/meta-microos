SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python310-rfc3987-1.3.8-5.1.noarch.rpm"
RPM_HASH = "ba871443ab08f9f9b3aefe039e9eafca869b5096679beb8912dd4e1ce2ec2b3405a2251a6d0ea514f841bb79e5dea0b32227e637a15505c5ea5b2b8419fb2e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3987 \
python3.10dist(rfc3987) \
python310-rfc3987 \
python3dist(rfc3987)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
