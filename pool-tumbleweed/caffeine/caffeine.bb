SUMMARY = "Utility to inhibit screensaver and sleep modes"
DESCRIPTION = "Caffeine is a status bar application able to temporarily prevent the \
activation of both the screensaver and the 'sleep' powersaving mode."
LICENSE = "GPL-3.0+ & LGPL-3.0+"

PV = "2.8.3"

RPM_NAME = "caffeine-2.8.3-1.20.noarch.rpm"
RPM_HASH = "32bdc414cfcaa8f3a1c417ca21a359b632c94092262db6fb7809cab6bb9e5ee9aa9d921372fdca52ecf3b9af2e8e34a11b802d1d218b721a8c69e6a06bb91714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caffeine \
caffeine-lang \
python3.11dist-caffeine \
python3dist-caffeine"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-xdg \
python3-xlib \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gtk"

inherit rpm
