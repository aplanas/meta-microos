SUMMARY = "Documentation for the D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains developer documentation."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-doc-0.112-3.3.noarch.rpm"
RPM_HASH = "9ca0312f94cfff869f124460ed736c97f974e8cd7fc77f518bf2e6a7a30ad46eba125998b9fb59176f7e1b2a4bcb0058a185a44b070d71d4a92e7f1e0d172a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-1-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
