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

RPM_NAME = "link-grammar-5.10.5-1.5.aarch64.rpm"
RPM_HASH = "0f3da16e8e3e389f0b64284e5957f19ad89c23dbb5731a9ff113814610270ac6ce5590a739929010ce8c07d07b863e971876e4ba68ee37376b496ee10932fc67"

RPROVIDES:${PN} += "link-grammar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
liblink-grammar.so.5"

inherit rpm
