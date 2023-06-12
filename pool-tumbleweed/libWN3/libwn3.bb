SUMMARY = "Shared library for wordnet"
DESCRIPTION = "WordNet is a large lexical database of English. \
Nouns, verbs, adjectives and adverbs are grouped into sets \
of cognitive synonyms (synsets), each expressing a distinct concept. Synsets \
are interlinked by means of conceptual-semantic and lexical relations. The \
resulting network of meaningfully related words and concepts can be navigated \
with the browser. \
WordNet's structure makes it a useful tool for computational linguistics and \
natural language processing. \
 \
This package contains shared library for wordnet."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "libWN3-3.0-35.1.aarch64.rpm"
RPM_HASH = "f7378710c20da5c512edb87070437b9577fc9ded86b7f3dceed59d13cd22d2d0ec0f954dc4cd5fa8a340176d6d2dda4d4343180e25a0bc5e0a8646b465b0c357"

RPROVIDES:${PN} += "libWN.so.3()(64bit) \
libWN3 \
libWN3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
