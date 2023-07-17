SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-MicroOS-17.89-1.40.aarch64.rpm"
RPM_HASH = "cb0aeb4e123ed471f287d0e0f70e6183b1728a7b9d6015562aea2696f2f8fbf40a5e5cd6116cd33954e5425a702a1d74b696b265b91b3fea053a880dcde1c7a6"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
