SUMMARY = "Setup Remote Desktop Protocol service for remote administration"
DESCRIPTION = "Configure RDP (remote desktop protocol) daemon to allow remote system administration."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-rdp-4.6.0-1.1.noarch.rpm"
RPM_HASH = "330092fdd37ae52e588183b41e461036fb5e922da653e70dc65a353ef6f21907f1108e74bff4feed190aa5af3bad9a476c7ce3c4988d6a9dd4116947102cb999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-rdp"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
