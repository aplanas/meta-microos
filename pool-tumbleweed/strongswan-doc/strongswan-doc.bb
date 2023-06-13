SUMMARY = "Documentation for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the StrongSwan documentation."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-doc-5.9.10-2.1.noarch.rpm"
RPM_HASH = "6c542c5918b34b6b8a23ce19e235c80e9a003fb1919086d88972dce4997925c3513405e582cae30051d3d84cbeec7bad49a0142338eed79cc57556e12c1e7b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "strongswan-doc"

RDEPENDS:${PN} += ""

inherit rpm
