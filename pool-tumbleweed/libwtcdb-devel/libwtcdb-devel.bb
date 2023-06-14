SUMMARY = "Development files for libwtcdb"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwtcdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb-devel-20210417-3.3.aarch64.rpm"
RPM_HASH = "528809054c482170c8bf49f924f2d48b13a194c3215e8ce19e72a07e7b9180437e6e68bd300fb7621c3ae08ff8ee18dbbc63532ae3f73d6ab9e1fe6aabe54aa6"

RPROVIDES:${PN} += "libwtcdb-devel \
pkgconfig-libwtcdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwtcdb1"

inherit rpm
