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

RPM_NAME = "perl-CommonMark-0.290000-4.23.aarch64.rpm"
RPM_HASH = "bed737e9a335fd6872e58a5fed607a00e4809b2d938e90ecb1c419effcc48b47344718c244518456b71dcd85862150c5636b087d529550ff66ec0e07b2d96ce6"

RPROVIDES:${PN} += "perl(CommonMark) \
perl(CommonMark::Node) \
perl-CommonMark \
perl-CommonMark(aarch-64)"

RDEPENDS:${PN} += "cmark \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcmark.so.0.30.3()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
