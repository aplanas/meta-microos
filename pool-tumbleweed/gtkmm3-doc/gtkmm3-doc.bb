SUMMARY = "C++ Interface for GTK3 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "gtkmm3-doc-3.24.7-2.4.noarch.rpm"
RPM_HASH = "ae392fdda66f1b79ea7aebb731e5d0241f8d2fd220e6c6f72c613ef1b524c53fd68f3a0785cc1cc9905b0c0d312a84d3097914a5ce37a7e645ef11d31b9ab706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm3-doc"

RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
