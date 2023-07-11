SUMMARY = "Documentation for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the StrongSwan documentation."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.11"

RPM_NAME = "strongswan-doc-5.9.11-2.1.noarch.rpm"
RPM_HASH = "f6039b7fdb514f5d387d594a2084d66fcc6147b0eb90f497bdbab1350f74accf19d9fd079cc0cd9cb64d440a1c748bb2b3b3081e69d42bfe7ead0fbd91f03b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "strongswan-doc"

RDEPENDS:${PN} += ""

inherit rpm
