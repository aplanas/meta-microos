SUMMARY = "Additional utilities related to libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides tools based on libfolks, like an importer for Pidgin \
metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "folks-tools-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "d4354972dd287ccb55b1ed5482447ac2d61bcd7fb2ca7a975781400db7bc186170acc0489b91fa16ba59bf0c5089e8342be990f325089261eb34b5ac2bea252f"

RPROVIDES:${PN} += "folks-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libreadline.so.8 \
libxml2.so.2"

inherit rpm
