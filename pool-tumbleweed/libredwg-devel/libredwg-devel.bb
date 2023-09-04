SUMMARY = "Development files for libredwg"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains the files required for development with libredwg."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5.5907"

RPM_NAME = "libredwg-devel-0.12.5.5907-2.1.aarch64.rpm"
RPM_HASH = "351db8619cb8d4d1b8afa0f7eca10977a032679b94ca5f1846ab5a480d94b47d58d789c55ed63277793d07652d761f18f045ae21396683e67e75b824cc7e3135"

RPROVIDES:${PN} += "libredwg-devel \
pkgconfig-libredwg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredwg0"

inherit rpm
