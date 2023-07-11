SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "libaugeas0-1.13.0-2.2.aarch64.rpm"
RPM_HASH = "22bd44ad11b191233c9dbf13b1dd591dbb6559f0455afb143634cba4237bbe9d8d94fe689ebbfbc9bb1b5e28e7876e0c1f0278460f162690c9f5042db5418fa3"

RPROVIDES:${PN} += "libaugeas.so.0 \
libaugeas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfa.so.1 \
libxml2.so.2"

inherit rpm
