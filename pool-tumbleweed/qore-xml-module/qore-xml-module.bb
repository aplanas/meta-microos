SUMMARY = "XML module for Qore"
DESCRIPTION = "This package contains the xml module for the Qore Programming Language. \
 \
XML is a markup language for encoding information."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "qore-xml-module-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "1c349d3f1b2d420d122ecaecdec949cff5521809c26f7324a8768c48448f947f18414238c354d26b146f3e596e89872a3aaedfecccceb6b48bd7fb8ff91fd8bd"

RPROVIDES:${PN} += "qore-xml-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
qore-module-abi"

inherit rpm
