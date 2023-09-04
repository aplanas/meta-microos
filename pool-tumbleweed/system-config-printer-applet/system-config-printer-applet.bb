SUMMARY = "Notification icon for printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides a notification icon to configure new printers and \
monitor print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-applet-1.5.18-3.1.noarch.rpm"
RPM_HASH = "e1d60a5f377a192836f3a506048d54bbf401b4579808cff14f2d2fe59d390facf429e59115a6d85b819d8c716b8c3675a6b9e19cdacc044b393873ecdbbd20c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-com.redhat.NewPrinterNotification \
system-config-printer-applet"

RDEPENDS:${PN} += "/usr/bin/sh \
system-config-printer \
system-config-printer-dbus-service"

inherit rpm
