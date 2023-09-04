SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-hooks-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "b2b3661550033de28dce3cf2890a862a955e4c8bb9c8711bc9feac15b8d93f1414f6e3deea261eb4794ec830ce8938a578d823507a2740edc34f7b68b8dce0a8"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
