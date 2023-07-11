SUMMARY = "Library for Object Linking and Embedding (OLE) data types"
DESCRIPTION = "libfole is a library for Object Linking and Embedding (OLE) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220115"

RPM_NAME = "libfole1-20220115-3.3.aarch64.rpm"
RPM_HASH = "393425e2669e0ec4fb916e72c6e915ad6c879f96f668e458bfa1526a7670b596b69c004bf7fbfde49eaed376e98ea6be1c0256a686bf31468528375f6f137cf6"

RPROVIDES:${PN} += "libfole.so.1 \
libfole1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcerror.so.1"

inherit rpm
