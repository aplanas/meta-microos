SUMMARY = "C++ Interface for DBus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-api-docs-0.9.1+git20170322-4.8.noarch.rpm"
RPM_HASH = "5bef8ce123c590b313c4ae7ec897a73585dcbfa9d33006f6e7a1d54d50085660b3cb0d627e20b359c2c751b57c2d23b7e80b9d74f1f78ca5530b2ae5373512ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbus-c++-api-docs"

RDEPENDS:${PN} += ""

inherit rpm
