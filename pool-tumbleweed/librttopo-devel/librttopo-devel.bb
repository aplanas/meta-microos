SUMMARY = "Development files for librttopo"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use librttopo."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "librttopo-devel-1.1.0-2.5.aarch64.rpm"
RPM_HASH = "60463b246976e4e24a3be0e43805464f1dea487d3a6a956331d8d51d0187b00e7b7ce0c8a06fe66f45118978282182c224f461870828731efcdfe5d717e4e25c"

RPROVIDES:${PN} += "librttopo-devel \
pkgconfig-rttopo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librttopo1"

inherit rpm
