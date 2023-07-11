SUMMARY = "Syntactic parser and grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of English, Russian, Arabic \
and Persian (and other languages as well), based on Link Grammar, an \
original theory of syntax and morphology. Given a sentence, the system \
assigns to it a syntactic structure, which consists of a set of labelled \
links connecting pairs of words. \
 \
This package contains Link Grammar's utility, its shared library and \
some data files."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "link-grammar-5.10.5-1.6.aarch64.rpm"
RPM_HASH = "47dd194a0e893240fbfbd40fd91d218844b4154ffef4689ca5427fc7b8fccbfd784c8ff6e1970904332cb093de9e63dde1a42dfccb695dc2ca2c2eb68802a778"

RPROVIDES:${PN} += "link-grammar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
liblink-grammar.so.5"

inherit rpm
