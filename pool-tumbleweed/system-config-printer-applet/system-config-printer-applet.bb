SUMMARY = "Notification icon for printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides a notification icon to configure new printers and \
monitor print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-applet-1.5.18-2.1.noarch.rpm"
RPM_HASH = "0055a94c7d8bd1e302d9a686fe40b3beac63c5dbd09123e0eb1e50bad3fb05896370d556e7e2dec402ad486a957d81ba4c02ce85f11d633d825e1b1595b1b745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus(com.redhat.NewPrinterNotification) \
system-config-printer-applet"

RDEPENDS:${PN} += "/bin/sh \
system-config-printer \
system-config-printer-dbus-service"

inherit rpm
