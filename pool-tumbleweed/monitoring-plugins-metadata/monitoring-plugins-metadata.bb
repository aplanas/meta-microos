SUMMARY = "Metadata for Monitoring plugins"
DESCRIPTION = "XML files containing metadata which facilitates using nagios \
plugins as resource agents. These files were produced from help \
pages of individual nagios plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "monitoring-plugins-metadata-4.12.0+git30.7fd7c8fa-1.2.noarch.rpm"
RPM_HASH = "3ce825809ea3d83ffbe6708c81603b5068d380ad25bdac6cdf8303ddfe33c46e6fc4d7abb097172544b24d1a40d5e294eebc669c7956b5fdc986a4281dffae6f"
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
