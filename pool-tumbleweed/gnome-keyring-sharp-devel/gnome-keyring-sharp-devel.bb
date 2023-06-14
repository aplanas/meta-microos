SUMMARY = "Managed implementation of libgnome-keyring"
DESCRIPTION = "When the gnome-keyring-daemon is running, you can use this to retrieve \
and store confidential information such as passwords, notes or network \
services user information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "gnome-keyring-sharp-devel-1.0.2-25.24.aarch64.rpm"
RPM_HASH = "19607793cd2910334f0431a2a4c5f1011f264986a783c7f6010b227e48f61b988d71349f043dc1dc64cc2806f618276a1710b63fa9eff0b8aad2fc61e6de800a"

RPROVIDES:${PN} += "gnome-keyring-sharp-devel \
pkgconfig-gnome-keyring-sharp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-keyring-sharp \
pkgconf-pkg-config"

inherit rpm
