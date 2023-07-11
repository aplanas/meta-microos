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

RPM_NAME = "sparse-0.6.4+20220627-2.2.aarch64.rpm"
RPM_HASH = "100d27bea0d2fb0e97a0d57cb60e439b9f3c18e809735c53cfdb45f3009a7e9793a59997774e79595b45dfdde1b66f8dc2c49bea7955b854188b74efa8bdd1bd"

RPROVIDES:${PN} += "sparse"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
