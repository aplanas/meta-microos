SUMMARY = "Utility to inhibit screensaver and sleep modes"
DESCRIPTION = "Caffeine is a status bar application able to temporarily prevent the \
activation of both the screensaver and the 'sleep' powersaving mode."
LICENSE = "GPL-3.0+ & LGPL-3.0+"

PV = "2.8.3"

RPM_NAME = "caffeine-2.8.3-1.19.noarch.rpm"
RPM_HASH = "eece79e400acbda02ac091068dc95e1e42cade7486c91459b2d8c2d82b9880f36da11be88dd656fc16ac924efc3eaf13dbe69a692be82c18439ed217a07d824c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(caffeine-indicator.desktop) \
application(caffeine.desktop) \
caffeine \
caffeine-lang \
python3.10dist(caffeine) \
python3dist(caffeine)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
python(abi) \
python3-xdg \
python3-xlib \
typelib(AppIndicator3) \
typelib(GLib) \
typelib(GObject) \
typelib(Gtk)"

inherit rpm
