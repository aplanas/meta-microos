SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python311-rfc3987-1.3.8-5.3.noarch.rpm"
RPM_HASH = "b40eec0765ab82a90124501e77fe88cef20888eba10934d3eb2974139ee0fc04dc77867dbed1b665bc7f48884c485eaabbd509fb09c6b75775254f373ab12895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3987 \
python3.11dist-rfc3987 \
python311-rfc3987 \
python3dist-rfc3987"

RDEPENDS:${PN} += "python-abi"

inherit rpm
