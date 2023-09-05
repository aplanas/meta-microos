SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "f5bdd03ab1d1afd57d3edc0411d6908dcfd033332ed42e6b1bc6113ec7a7926661b9a2023ad3a9dfbb5bbe04ae3bde5ff54578bd134a2deefaad0771e0f38936"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
