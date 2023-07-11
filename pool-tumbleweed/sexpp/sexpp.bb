SUMMARY = "S-expressions parser and generator library"
DESCRIPTION = "This is a C++ library for working with S-expressions. S-expressions \
are a data structure for representing complex data as a variation on \
LISP S-expressions."
LICENSE = "MIT"

PV = "0.8.7"

RPM_NAME = "sexpp-0.8.7-1.1.aarch64.rpm"
RPM_HASH = "b27816fff6e6af1e5c7c580d08314bc9a648f500860e20b47cbf653e2e180f2ba8a7fafaa53cea25aa208da88d0e9080d4c7c1954dcb2f7f2101cf7fd356b550"

RPROVIDES:${PN} += "sexpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsexpp.so.0 \
libstdc++.so.6"

inherit rpm
