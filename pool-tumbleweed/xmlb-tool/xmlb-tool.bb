SUMMARY = "Optional tool for libxmlb"
DESCRIPTION = "This package provides the optional xb-tool for libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.13"

RPM_NAME = "xmlb-tool-0.3.13-1.1.aarch64.rpm"
RPM_HASH = "0c7aebcba75cb90f5cb38f1ef11680ad3125b3f8f809a8a4bb7bf709dfe05afb43c6224c9a87f0ae170c291febbd2fefc912bb88795021de7a09031386467c39"

RPROVIDES:${PN} += "xmlb-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxmlb.so.2"

inherit rpm
