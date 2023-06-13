SUMMARY = "A semantic parser of source files"
DESCRIPTION = "Sparse is a semantic parser of source files: it's neither a compiler \
(although it could be used as a front-end for one) nor is it a \
preprocessor (although it contains as a part of it a preprocessing \
phase). \
 \
It is meant to be a small - and simple - library.  Scanty and meager, \
and partly because of that easy to use.  It has one mission in life: \
create a semantic parse tree for some arbitrary user for further \
analysis.  It's not a tokenizer, nor is it some generic context-free \
parser.  In fact, context (semantics) is what it's all about - figuring \
out not just what the grouping of tokens are, but what the _types_ are \
that the grouping implies. \
 \
Sparse is primarily used in the development and debugging of the Linux \
kernel."
LICENSE = "MIT"

PV = "0.6.4+20220627"

RPM_NAME = "sparse-0.6.4+20220627-2.1.aarch64.rpm"
RPM_HASH = "a4579e3c69b8d0ffbb4e962131d61ae0f3eee3b80c050a8b43841192e11f756a51ab0eca4db9bbc29621f48477d6c785b4225752074d9f61456eb0a560edd6be"

RPROVIDES:${PN} += "sparse \
sparse(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
