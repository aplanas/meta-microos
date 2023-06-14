SUMMARY = "openSUSE MicroOS configuration file for could-init"
DESCRIPTION = "This package contains the openSUSE MicroOS specific \
configuration file for cloud-init."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "cloud-init-config-MicroOS-1.1-2.10.noarch.rpm"
RPM_HASH = "cc6589370bfa33a4136ba907bdff3433428ac411f3caa6d789fe6055420ecd7df7c9cad8f7dfb81b8d8168bd1479211fea1f0a3a984dac3a926be4fd02585110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-MicroOS \
config-cloud-init-config-MicroOS"

RDEPENDS:${PN} += "cloud-init"

inherit rpm
