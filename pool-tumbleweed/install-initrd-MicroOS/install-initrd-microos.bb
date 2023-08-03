SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "install-initrd-MicroOS-17.90-1.26.aarch64.rpm"
RPM_HASH = "0f82551db42252113a59eda1cb0c1dfff842cfda555747168201b0dbb142eabb2c116d3d14e3c00797f303dd4b931469c6a64b43d275cf4901dc6dcda7d6e938"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
