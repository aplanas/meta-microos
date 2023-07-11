SUMMARY = "S-expressions parser and generator library"
DESCRIPTION = "This is a C++ library for working with S-expressions. S-expressions \
are a data structure for representing complex data as a variation on \
LISP S-expressions. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "0.8.7"

RPM_NAME = "libsexpp0-0.8.7-1.1.aarch64.rpm"
RPM_HASH = "782b50b6e0e49a4608b78a91e1ea17bfdafd5bbbbd70f6fd0431f0e2e907c9aab3dadc92e52e84e1ab4b59b80299687ff31678304079a6be519e9fc887ddcd9a"

RPROVIDES:${PN} += "libsexpp.so.0 \
libsexpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
