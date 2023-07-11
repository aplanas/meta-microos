SUMMARY = "C++ Interface for GTK4 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-doc-4.10.0-1.2.noarch.rpm"
RPM_HASH = "cb9025ce829522e27bb78e4c31b219425c9023db59c496cae42278debf568f97178df730c69444c2b264cb30d602320d1ab55f1c03f0dab085a56b45c3b09f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm4-doc"

RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
