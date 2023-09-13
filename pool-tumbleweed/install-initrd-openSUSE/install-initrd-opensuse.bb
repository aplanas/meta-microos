SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-openSUSE-17.91-1.100.aarch64.rpm"
RPM_HASH = "937e6bf9571875a0cd2fc668278d14076e49bff1f701f9b55ccaddbe7dda8c2ec228c06f3f233eab04e2cda0bce8996c55a3c309a4d934c16432e818bf066bcd"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
