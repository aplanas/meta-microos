SUMMARY = "Commands for Manipulating Extended Attributes"
DESCRIPTION = "A set of tools for manipulating extended attributes on file system \
objects, in particular getfattr(1) and setfattr(1). An attr(1) command \
is also provided, which is largely compatible with the SGI IRIX tool of \
the same name."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "attr-2.5.1-1.21.aarch64.rpm"
RPM_HASH = "9d37deda0cce05c106bd250db7351b3dcc4c881c960849ba688deb7b8aa331692723fa4598c78dbfca67c71b32cc4b0a37d4c74cd62aa9e9b7b52041e4fc1bc2"

RPROVIDES:${PN} += "attr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libattr.so.1 \
libc.so.6"

inherit rpm
