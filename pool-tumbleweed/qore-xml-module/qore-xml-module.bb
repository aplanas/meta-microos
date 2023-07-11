SUMMARY = "XML module for Qore"
DESCRIPTION = "This package contains the xml module for the Qore Programming Language. \
 \
XML is a markup language for encoding information."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "qore-xml-module-1.8.0-1.4.aarch64.rpm"
RPM_HASH = "c700cb4295f05f6aae61320e2d5de45c37acfb23cce4d89ce9cd620dc385be56d468ad10e731a6e955cc89734ad04822dcb3bbb8c59291cb91dd1dc181243a71"

RPROVIDES:${PN} += "qore-xml-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
qore-module-abi"

inherit rpm
