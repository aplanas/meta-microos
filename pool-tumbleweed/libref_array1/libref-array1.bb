SUMMARY = "A refcounted array for C"
DESCRIPTION = "A dynamically-growing, reference-counted array"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "libref_array1-0.1.5-28.1.aarch64.rpm"
RPM_HASH = "a942aab4cc0e26321982f2a4f5ddeee9685ae85afb640ce9d5dce56937dc07ee1026b5e8e2700a28bd5d2aa8789805b8ad5c077f3e486ad6ed50065efb3f9f79"

RPROVIDES:${PN} += "libref-array.so.1 \
libref-array1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
