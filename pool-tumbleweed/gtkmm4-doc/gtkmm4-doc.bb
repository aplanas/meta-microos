SUMMARY = "C++ Interface for GTK4 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-doc-4.10.0-2.1.noarch.rpm"
RPM_HASH = "af6204ea47e04123acca5e0dcfead516d915740b86c9c6431dcf8c64a2dcf151d3c89afafe158712aee2badcce4586ffee515da28f56602e37766fd3ba68e1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm4-doc"

RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
