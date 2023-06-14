SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "ac386d7d6c9f277ac0bc090092c390e8f45ed574398e1f156bb7c1d5b78ae4b1a4a6b683bd83aa8c15e3dc94c4736697b0a2668a0afe7c8a2717d6d6e48680d9"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
