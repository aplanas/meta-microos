SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-hooks-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "05e4d1b4cd6cc56f5ff6dbe89d4ffe8f3cc068bf178ace8825a8eba7d6d4cb546659618989253828f9fbca9bbb8b998ea18a5f6411a5fa2352ed812f36580ab4"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
