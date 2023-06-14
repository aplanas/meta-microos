SUMMARY = "Grafana configuration providers for the SLES HA Extension"
DESCRIPTION = "Automated configuration provisioners leveraged by other packages to enable a zero-config installation of Grafana dashboards."
LICENSE = "Apache-2.0"

PV = "1.1.0+git.1622804483.3ca98bd"

RPM_NAME = "grafana-sleha-provider-1.1.0+git.1622804483.3ca98bd-1.6.noarch.rpm"
RPM_HASH = "4c57a88890e43c39614aab087a6e5917a917a26a07bf6c9f5978bdb1ef87de91155414955438e6061a54f30a8d4089822eaacd65799fa56bde89b857b2d96697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-sleha-provider \
grafana-sleha-cluster-provider \
grafana-sleha-provider"

RDEPENDS:${PN} += ""

inherit rpm
