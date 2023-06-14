SUMMARY = "Default session support for the GNOME Session Manager"
DESCRIPTION = "This package contains the definition of the default GNOME session."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-default-session-44.0-2.1.aarch64.rpm"
RPM_HASH = "6d05000833613027d02d0bf58b30601c56836616105d738b25e8897a1b7e2f56350b1dd92f60559bd5a32d0d9234bed6fb27584369ab178c6bf3af31f82a833a"

RPROVIDES:${PN} += "gnome-session-default-session"

RDEPENDS:${PN} += "gnome-session \
gnome-settings-daemon \
gnome-shell"

inherit rpm
