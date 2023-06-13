SUMMARY = "C++ Bindings for GTK+ -- Tutorial"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm wraps \
GTK+. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-tutorial-4.10.0-1.1.noarch.rpm"
RPM_HASH = "9c0b47cd88f0926b27f3483508363798d22a649c7f1c3f8faaf784e39c391afb1c4d50271410c02385807584645e6f70b06a00e33d50ca87d69727e0553b89c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm-documentation \
gtkmm-tutorial \
gtkmm4-documentation \
gtkmm4-tutorial"

RDEPENDS:${PN} += "gtkmm4-doc"

inherit rpm
