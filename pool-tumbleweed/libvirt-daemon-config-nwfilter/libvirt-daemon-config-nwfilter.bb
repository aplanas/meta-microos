SUMMARY = "Network filter configuration files for the libvirtd"
DESCRIPTION = "Network filter configuration files for the libvirt daemon, used for \
cleaning guest network traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "90e520ca53155cb3de8b3d4adc42c783077fd8a330e7e559684c072c3535c8f13b95a2d2eb56c89db8c44fca4dcee3e98375520728cd481f55c6ff76292045bf"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
