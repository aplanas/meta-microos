SUMMARY = "Documentation for texlive-refenums"
DESCRIPTION = "This package includes the documentation for texlive-refenums"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn44131"

RPM_NAME = "texlive-refenums-doc-2023.209.1.1.2svn44131-54.2.noarch.rpm"
RPM_HASH = "191d5e39a274e165b031d7a310e09618a41a9ff3eab41a2d177494f5c0a38c3721e7590d4c5f5afffb6b1c4bdadf3fd66020e46fdc73544c67a33db0eeebff0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refenums-doc"

RDEPENDS:${PN} += ""

inherit rpm
