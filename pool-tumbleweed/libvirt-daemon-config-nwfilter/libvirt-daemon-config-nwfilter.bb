SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "43c65796262cc1070ba7cf8416db1c91ef0b618b4e9731d0cf7e4b03f4c9cfda4e4792a951281ccf9f653f88cce161bb73b4da1762813dae2f42f1adbc764621"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
