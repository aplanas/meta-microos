SUMMARY = "A Lexical Analyzer Generator for Java"
DESCRIPTION = "JLex is a lexical analyzer generator for Java."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "jlex-1.2.6-283.7.noarch.rpm"
RPM_HASH = "00f28aa69a0f4200a0b04cc93a7820bfc27f756aa5c7c582af599d6909f8a3cc1c4c8a26d57893101d6c81f9ab0f609e4cc764188f429636c1d6e4f8fb096ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlex"

RDEPENDS:${PN} += ""

inherit rpm
