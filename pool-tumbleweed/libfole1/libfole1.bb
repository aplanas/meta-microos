SUMMARY = "Library for Object Linking and Embedding (OLE) data types"
DESCRIPTION = "libfole is a library for Object Linking and Embedding (OLE) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220115"

RPM_NAME = "libfole1-20220115-3.2.aarch64.rpm"
RPM_HASH = "931ac697965634cbb7a1fd002115df23e18fcfacc5316e243fb1b637e8f0ebf767ab90c2f3881024c97b45ac4b222d6444573a96342b749834818db954ba270c"

RPROVIDES:${PN} += "libfole.so.1 \
libfole1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcerror.so.1"

inherit rpm
