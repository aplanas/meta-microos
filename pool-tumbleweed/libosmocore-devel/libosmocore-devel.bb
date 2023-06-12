SUMMARY = "Development files for the Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocore."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocore-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "82aa9f18c1f210035f407c820c1ed013e7aedee3683faa4971ddb142320a915fd42288dacff9d0eb35c416249dda023be32e34f6371896583c3a83161fc02684"

RPROVIDES:${PN} += "libosmocore-devel \
libosmocore-devel(aarch-64) \
pkgconfig(libosmocore)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore20 \
libtalloc-devel \
pkgconfig(libmnl) \
pkgconfig(libsctp) \
pkgconfig(talloc)"

inherit rpm
