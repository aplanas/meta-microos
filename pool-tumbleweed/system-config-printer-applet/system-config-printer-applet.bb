SUMMARY = "Notification icon for printing via system-config-printer"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides a notification icon to configure new printers and \
monitor print jobs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-applet-1.5.18-2.2.noarch.rpm"
RPM_HASH = "2ceea3be108e99791d2705309acfd1380531a58ffa3aade6993bc9b6e3ca5bc6fdedb5d6acd4d6acf666f9f1db60d9051399ea6d3f7d5e78c98ba2ca4a9396df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-com.redhat.NewPrinterNotification \
system-config-printer-applet"

RDEPENDS:${PN} += "/usr/bin/sh \
system-config-printer \
system-config-printer-dbus-service"

inherit rpm
