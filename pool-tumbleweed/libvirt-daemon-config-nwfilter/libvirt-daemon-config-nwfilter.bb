SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "c490de844ddb802bdfd1b75b449b752860feb8f1aa2f478820ea29f3c1ebd585460019d191b124b4b0aa9e776b5d92076e2eab5d4e71626128fa6e0adef33dd0"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
