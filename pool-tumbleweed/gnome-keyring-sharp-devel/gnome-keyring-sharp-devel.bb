SUMMARY = "Managed implementation of libgnome-keyring"
DESCRIPTION = "When the gnome-keyring-daemon is running, you can use this to retrieve \
and store confidential information such as passwords, notes or network \
services user information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "gnome-keyring-sharp-devel-1.0.2-25.25.aarch64.rpm"
RPM_HASH = "84f6b986bda4603f6e4a7ce4fd9ae252a638a49b2f93e4c4b8bfe67c0824077cb009259ecbcfc82919b1c50e902edc3a8a0239e1da5f609d18638f4788cb3d88"

RPROVIDES:${PN} += "gnome-keyring-sharp-devel \
pkgconfig-gnome-keyring-sharp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-keyring-sharp \
pkg-config"

inherit rpm
