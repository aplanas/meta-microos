SUMMARY = "Glib integration for DBus - development files"
DESCRIPTION = "This package provides glib integration for Mono.DBus - Development \
files."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "dbus-sharp-glib-devel-0.5.0-15.8.noarch.rpm"
RPM_HASH = "c0415b25504ecb1f324d367577d11788a6ab0af14fd2d083bb9d14f44e317fd4c27bd36f889f0f79cd3f82b7bcb839a82594cb8b6fbac7fa1f57dcf904eeb804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib-devel \
pkgconfig-dbus-sharp-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-sharp-glib \
pkgconfig-dbus-sharp-1.0"

inherit rpm
