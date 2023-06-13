SUMMARY = "Development files for libfole"
DESCRIPTION = "libfole is a library for Object Linking and Embedding (OLE) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfole."
LICENSE = "LGPL-3.0-or-later"

PV = "20220115"

RPM_NAME = "libfole-devel-20220115-3.2.aarch64.rpm"
RPM_HASH = "dedd9a22b1ffd8e657e3ff016fc2e81ceef0354a70b01fd219edbaeb6602af6ba49594a9a520bf4e2e04c3eede051b265297381f6cf86934ffedc726e888210d"

RPROVIDES:${PN} += "libfole-devel \
libfole-devel(aarch-64) \
pkgconfig(libfole)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfole1"

inherit rpm
