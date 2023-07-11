SUMMARY = "The settings Daemon for the Cinnamon Desktop -- Development Files"
DESCRIPTION = "This package contains the settings Daemon for the Cinnamon Desktop. \
 \
This package contains development files for cinnamon-settings-daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.0"

RPM_NAME = "cinnamon-settings-daemon-devel-5.2.0-2.8.aarch64.rpm"
RPM_HASH = "9af3be5fb39873131d69cfa63f04a686748d41bf8fbe56809926ede06ad723c77d1761909e54a840705f2326b33c21ff8c0bfef057357e4675fa4f7bf7a631b5"

RPROVIDES:${PN} += "cinnamon-settings-daemon-devel \
pkgconfig-cinnamon-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cinnamon-settings-daemon \
pkgconfig-glib-2.0"

inherit rpm
