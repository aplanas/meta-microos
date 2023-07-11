SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-hooks-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "ad468f4377b3fd1eb1de1bef1ad4400af421fead3ec7630b82eb1c9e0815c26ba1faeb55448d95ca06347c7a57fcd4db0694fe57b1ea3142a7afd81eba437989"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
