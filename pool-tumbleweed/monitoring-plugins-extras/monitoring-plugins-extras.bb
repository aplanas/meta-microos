SUMMARY = "Plug-Ins which depend on additional packages"
DESCRIPTION = "These are additional monitoring checks that require additional packages \
which have to be installed."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-extras-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "5b08410953ba113cd96822bc97d5c8efc2fc85a70727f99ff4c07458b894959323c6ec12ac1a8d2f10ad4970252aacdf07180c1e9cdbb35b8b794b855a4f0f0d"

RPROVIDES:${PN} += "monitoring-plugins-extras \
nagios-plugins-extras"

RDEPENDS:${PN} += "monitoring-plugins-common"

inherit rpm
