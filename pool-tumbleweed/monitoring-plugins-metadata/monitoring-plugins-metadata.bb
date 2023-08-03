SUMMARY = "Metadata for Monitoring plugins"
DESCRIPTION = "XML files containing metadata which facilitates using nagios \
plugins as resource agents. These files were produced from help \
pages of individual nagios plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.12.0+git50.5c26404e"

RPM_NAME = "monitoring-plugins-metadata-4.12.0+git50.5c26404e-1.1.noarch.rpm"
RPM_HASH = "346dccd577d23dbd7a2bea9b57dcb0edfc4ee3a69dfa9e8f283aaaacd67051552e38e7569e7d2049102ddc73577b0515e732207ac03f6a481b710bd5e99fec72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-metadata \
nagios-plugins-metadata"

RDEPENDS:${PN} += "monitoring-plugins-fping \
monitoring-plugins-http \
monitoring-plugins-ldap \
monitoring-plugins-mysql \
monitoring-plugins-pgsql \
monitoring-plugins-tcp \
resource-agents"

inherit rpm
