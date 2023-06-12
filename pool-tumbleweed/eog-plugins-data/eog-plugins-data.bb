SUMMARY = "Common data for eog-plugins"
DESCRIPTION = "Common data required by all Eye of Gnome plugins"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugins-data-44.0-1.1.noarch.rpm"
RPM_HASH = "c71f2c3d56c69d483288877ef539ffd1c4340c35c1985b05076f3fc083110522988fe03b9880d45931fabd27be9812d18ab93e056b9075bf41b09edf9fd5d925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-plugins-data"
RDEPENDS:${PN} += "eog"

inherit rpm
