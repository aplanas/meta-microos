SUMMARY = "Documentation for texlive-context-transliterator"
DESCRIPTION = "This package includes the documentation for texlive-context-transliterator"
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn61127"

RPM_NAME = "texlive-context-transliterator-doc-2023.204.svn61127-54.1.noarch.rpm"
RPM_HASH = "28aac845ead6dac0730b5c25c7b6165261cff4a610670a58abf790e85bd435a8ffd1bfbef7abb295ad727bd5fc7b0fb85bd792b2c6c00e6cac687d21aacc8214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-transliterator-doc"
RDEPENDS:${PN} += ""

inherit rpm
