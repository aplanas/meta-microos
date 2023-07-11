SUMMARY = "Metapackage to make nft the default backend for iptables/arptables/ebtables"
DESCRIPTION = "Installation of this package adds higher priority alternatives (cf. \
update-alternatives) that makes the iptables, ip6tables, arptables \
and ebtables commands point to a program variant that uses the \
nftables kernel interface."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "iptables-backend-nft-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "7455fee6d9315c00a298131e236b48acb948e3dcb947c617817d2a17ffa19208c9bfa59781246adc5bdab729924dabdc6fbfe42b5cfdf56063ab9a0d3cce90f1"

RPROVIDES:${PN} += "iptables-backend-nft \
iptables-nft"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
iptables"

inherit rpm
