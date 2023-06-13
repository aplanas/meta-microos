SUMMARY = "Optional tool for libxmlb"
DESCRIPTION = "This package provides the optional xb-tool for libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "xmlb-tool-0.3.11-1.1.aarch64.rpm"
RPM_HASH = "aee39fe06c6ef5044e2cc9070688439aef987aa90a9b7f25518d0efc34515b93ba5b5f098231254782191aeeeb4a0aebcb7f0b0ddc3b549e4cba07a3ed8ae18e"

RPROVIDES:${PN} += "xmlb-tool \
xmlb-tool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxmlb.so.2()(64bit)"

inherit rpm
