SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "ed1a60de6b02b93b764f0ca208a60327ef58ce930797df23c5dfc76a72b5e2f11ff873a13470718220d464453bfc1ee777a4aa33d14779d2b627109fab36a062"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
