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

RPM_NAME = "gnome-settings-daemon-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "59b68d30532c14d7112e1f150749a524b219ca6dcb579192f765c60960e4399f88dcabe19728ae56d868988616411cd0848baa3e220c85df00634836773840cd"

RPROVIDES:${PN} += "gnome-settings-daemon-devel \
gnome-settings-daemon-devel(aarch-64) \
pkgconfig(gnome-settings-daemon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-settings-daemon"

inherit rpm
