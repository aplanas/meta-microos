SUMMARY = "Documentation for subnetcalc"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. \
This packages provides documentation and help files for subnetcalc."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.21"

RPM_NAME = "subnetcalc-doc-2.4.21-1.2.noarch.rpm"
RPM_HASH = "b74a258fd832a303b61cfbe6f28b046a4f9a3b8a91b596e3c3ea0a16b1af521426d7aeebe218d7fd991e61777f4fb9bd4b97caef49db4ab7b2f66585359a2043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subnetcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
