SUMMARY = "Development package for the GNOME settings daemon"
DESCRIPTION = "gnome-settings-daemon provides a daemon run by all GNOME sessions to \
provide live access to configuration settings and the changes done to \
them as well as basic services like a clipboard manager, controlling \
the startup of the screensaver, etc. \
 \
This package includes header files used for client applications to \
contact the settings daemon via its DBus interface."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "44.1"

RPM_NAME = "gnome-settings-daemon-devel-44.1-2.1.aarch64.rpm"
RPM_HASH = "0bd4318c08e578170acd8325665f6baf1306702a4ac3d494da2b73a1994b5983d80984880ef9497c3877cb4cfc1876b7a52dc589dfce0c3221d32b6311b5c617"

RPROVIDES:${PN} += "gnome-settings-daemon-devel \
pkgconfig-gnome-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-settings-daemon"

inherit rpm
