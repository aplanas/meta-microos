SUMMARY = "Metapackage to make nft the default backend for iptables/arptables/ebtables"
DESCRIPTION = "Installation of this package adds higher priority alternatives (cf. \
update-alternatives) that makes the iptables, ip6tables, arptables \
and ebtables commands point to a program variant that uses the \
nftables kernel interface."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "iptables-backend-nft-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "80e177ca55b2ff257dd2c9e1f1fb89ff9a797ac41f1397fd38030fac4850e2edc97ac3339b5593e93f8c941d5edc079dc1c2c4c7f0c978e6c799e008ed8c1fc9"

RPROVIDES:${PN} += "iptables-backend-nft \
iptables-backend-nft(aarch-64) \
iptables-nft"

RDEPENDS:${PN} += "/bin/sh \
alts \
iptables"

inherit rpm
