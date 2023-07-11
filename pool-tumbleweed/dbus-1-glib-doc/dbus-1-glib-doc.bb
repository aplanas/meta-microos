SUMMARY = "Documentation for the D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains developer documentation."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-doc-0.112-3.4.noarch.rpm"
RPM_HASH = "ea6a2f2d2b311b8bb94f5902181dca0bb789fc8b5f6ceb3e6eb53ddf449705f4977fe23a4b039396f3a7c240b233cefd36ff339d2df9e00d8d0652282a473924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-1-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
