SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-hooks-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "f431aab09f77cdf7f05e8aa30353c27622738956e5a1b90438f1fc50be1f68474d19464e22b1857c573ad1b02b64b27e845404996d358eee8e79435a35f7e7ee"

RPROVIDES:${PN} += "libvirt-daemon-hooks \
libvirt-daemon-hooks(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
