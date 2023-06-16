SUMMARY = "Plugin to check freshness of repomd.xml file"
DESCRIPTION = "This plugin checks the up-to date state of repomd.xml. \
 \
Important options: \
 -u <url_to_repomd.xml> : please enter the full URL to the repomd.xml file \
 -o <days>              : days unless a repomd.xml file is handled as outdated (default: 30)"
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "monitoring-plugins-repomd-2.1-2.6.noarch.rpm"
RPM_HASH = "21e318ea018d578539f36ccecd5badf42de82bdd8c2ea14f863f8e46f941d5d854f7e4ceb12f456c704deaff046615a7eff600a9706027e3a0b4feae9fae7e1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-repomd \
monitoring-plugins-repomd \
nagios-plugins-repomd"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
grep \
monitoring-plugins-common"

inherit rpm
