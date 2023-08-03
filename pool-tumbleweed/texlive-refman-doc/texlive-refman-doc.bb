SUMMARY = "Documentation for texlive-refman"
DESCRIPTION = "This package includes the documentation for texlive-refman"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0esvn15878"

RPM_NAME = "texlive-refman-doc-2023.209.2.0esvn15878-54.1.noarch.rpm"
RPM_HASH = "06ee855a4fde3465a08ec7a612e673083cff72de2a428d3bc85e4f1acd208b07436f72bbbefd2ca070fe95ca0dc9bd76ab4fb7d8452d6a84f6454873a8f9ecd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-refman-doc-de;en \
texlive-refman-doc"

RDEPENDS:${PN} += ""

inherit rpm
