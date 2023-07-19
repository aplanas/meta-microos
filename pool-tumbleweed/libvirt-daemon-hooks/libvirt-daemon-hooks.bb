SUMMARY = "Hook scripts for the libvirtd daemon"
DESCRIPTION = "Default hook scripts for the libvirt daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-hooks-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "99d97ab643b9b301acd47fdffd7a062c405825d198242240e1caa6393414f653923912e744fd447a31461ce7fb6cf2705397806e7f98c99bdde861d17991e0f5"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
libvirt-daemon \
python3-lxml"

inherit rpm
