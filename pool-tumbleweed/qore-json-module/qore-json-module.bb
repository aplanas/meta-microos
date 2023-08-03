SUMMARY = "JSON module for Qore"
DESCRIPTION = "This package contains the json module for the Qore Programming Language. \
 \
JSON is a concise human-readable data serialization format."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "qore-json-module-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "ec703aacdacf17418a13bcb7a1bf7164fafb28b61e80efc85e948496aff4fbbe6110059e5fc8afb3d40e0f3896a66eb2b33e8dbdac677e49273de1e3c0680d23"

RPROVIDES:${PN} += "qore-json-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
