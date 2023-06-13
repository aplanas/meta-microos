SUMMARY = "Plug-Ins which depend on additional packages"
DESCRIPTION = "These are additional monitoring checks that require additional packages \
which have to be installed."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-extras-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "374c76b296fd29d829603098a80727738d60dbe1f0969dd8bd2ebbb00a49b5470b7accadc5654e99273eaba5d36a92e39c7c88547b27b836b4147fde48cc4659"

RPROVIDES:${PN} += "monitoring-plugins-extras \
monitoring-plugins-extras(aarch-64) \
nagios-plugins-extras"

RDEPENDS:${PN} += "monitoring-plugins-common"

inherit rpm
