SUMMARY = "Development files for xylib"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use xylib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "xylib-devel-1.6-1.15.aarch64.rpm"
RPM_HASH = "7fcc4eb3664077563876d0762766470fdfc7c522ebbbc39d1e916e4979f58675bb2c8e5251cd885b55823d9c843123e5c7f7e5e63666f77c35405479d0b74ca2"

RPROVIDES:${PN} += "xylib-devel"

RDEPENDS:${PN} += "libxy3"

inherit rpm
