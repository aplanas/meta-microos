SUMMARY = "XML module for Qore"
DESCRIPTION = "This package contains the xml module for the Qore Programming Language. \
 \
XML is a markup language for encoding information."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "qore-xml-module-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "e278264fd6c511abaa3d069a60d7d2ddb83323300139adfa976460ee3632960aad7d6f42dc18ee043864a0b86b0402322b755ebac51b5b68abd1a15c3c5dba78"

RPROVIDES:${PN} += "qore-xml-module \
qore-xml-module(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
