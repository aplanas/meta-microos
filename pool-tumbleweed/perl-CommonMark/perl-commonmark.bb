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

RPM_NAME = "perl-CommonMark-0.290000-4.24.aarch64.rpm"
RPM_HASH = "e3ce85e585766d2854ced564d2c7f0e811ed170f9c2787718d2042b891c2927818a64ee2ed7c452f9dbdebe26c7f9756cc48d390fc02dd80311be0cadfb3a765"

RPROVIDES:${PN} += "perl-CommonMark \
perl-CommonMark--Node"

RDEPENDS:${PN} += "cmark \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark.so.0.30.3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
