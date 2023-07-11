SUMMARY = "C++ Interface for DBus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-api-docs-0.9.1+git20170322-4.10.noarch.rpm"
RPM_HASH = "3f44cbba4b7cae9cf91c4cff0900ef34d74cd2c20c2424e37bbb2a3f61374806ba99de13f89db0b85e30416bc02e0dee46c74562eda8d0ba250ea3ea00c78f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbus-c++-api-docs"

RDEPENDS:${PN} += ""

inherit rpm
