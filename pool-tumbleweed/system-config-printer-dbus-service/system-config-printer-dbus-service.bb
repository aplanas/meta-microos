SUMMARY = "D-Bus service to configure printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This packages provides a D-Bus service to configure printers and manage \
print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-dbus-service-1.5.18-2.2.noarch.rpm"
RPM_HASH = "70234c74dc2db77aedc4d05cc0940de95b0f82675e843460e1799d20dae20565ba35894e5b0f828742e399687369f689b85fbb43f95a288b6ed96c22d7e34737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-config-printer-dbus-service"

RDEPENDS:${PN} += "/usr/bin/sh \
system-config-printer-common"

inherit rpm
