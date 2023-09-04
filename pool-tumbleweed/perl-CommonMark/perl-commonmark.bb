SUMMARY = "Interface to the CommonMark C library"
DESCRIPTION = "This module is a wrapper around the official CommonMark C library \
_libcmark_. It closely follows the original API. \
 \
The main module provides some entry points to parse documents and \
convenience functions for node creation. The bulk of features is available \
through CommonMark::Node objects of which the parse tree is made. \
CommonMark::Iterator is a useful class to walk through the nodes in a tree. \
CommonMark::Parser provides a push parser interface."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.290000"

RPM_NAME = "perl-CommonMark-0.290000-4.25.aarch64.rpm"
RPM_HASH = "677187ccc45d4c1b425c129b4b9bad19fd7ec3ba2ea1374a40f671b2c34838fda353f5d8f074c565e22de0c877a27db76610ca0001f768e05efce87282b637fd"

RPROVIDES:${PN} += "perl-CommonMark \
perl-CommonMark--Node"

RDEPENDS:${PN} += "cmark \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark.so.0.30.3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
