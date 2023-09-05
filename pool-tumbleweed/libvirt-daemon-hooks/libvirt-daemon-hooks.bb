SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-hooks-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "1087ad7d973c14ab442135a844bcbe3279eddcb013e5b271a394e7d25186bebcbc8c7d7b0539fe16003dd778110c9ecb79dd91d855e2d85bac199093e8a638d3"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
