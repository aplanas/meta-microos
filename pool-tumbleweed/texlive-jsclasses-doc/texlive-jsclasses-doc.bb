SUMMARY = "Documentation for texlive-jsclasses"
DESCRIPTION = "This package includes the documentation for texlive-jsclasses"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66093"

RPM_NAME = "texlive-jsclasses-doc-2023.201.svn66093-55.1.noarch.rpm"
RPM_HASH = "b70dd746f87a9c71d2b8d9651d3561f6f96dc044f5b469033388fc02fde3e36b303316cdcaa24854d0b6fccb57ec2cc6b4eeea010acfbd6ece280b955d305a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jsclasses-doc-ja \
texlive-jsclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
