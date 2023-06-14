SUMMARY = "JSON module for Qore"
DESCRIPTION = "This package contains the json module for the Qore Programming Language. \
 \
JSON is a concise human-readable data serialization format."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "qore-json-module-1.8.2-1.2.aarch64.rpm"
RPM_HASH = "f2e88ae1d85a590f0cba829f50fe727148d4d550e7378c927f1063c8ef4ffc1b90570bd77be30f4b2568625487a889fc9986d6b6c25ed5d6ea911b2010362384"

RPROVIDES:${PN} += "qore-json-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
