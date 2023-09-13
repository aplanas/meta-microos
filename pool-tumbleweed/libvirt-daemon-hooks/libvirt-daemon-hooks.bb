SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-hooks-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "41c03b8d74fc9f10f370484a23b065fa2762f248b8e96d3f896650978f869874f62b131a43eb7d3ab9b8bcf249e7157580c603a28d6aeb2c24d7a089b53c85bf"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
