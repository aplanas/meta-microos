SUMMARY = "Documentation for texlive-glossaries-polish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-polish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "080bf5693ff3bb34c8736fb8f236a3bd55e5546126c54ca17b27f5ccaf9be46407bd61bb44a455b2bd7e7f1dc62ea3c7fb58981581ce24a69e202dcca53df113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
