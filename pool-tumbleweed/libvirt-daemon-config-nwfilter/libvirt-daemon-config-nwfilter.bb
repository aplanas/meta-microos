SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "530a5d42436a6e0703d7a0df52a2fcf8d0476c75afb0c32ce0972bee42fd3007e5a0834692d81899e317debb289222f6b25c828b3109e4fa92f6772cc2d2f0b1"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
