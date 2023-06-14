SUMMARY = "Documentation for texlive-gentombow"
DESCRIPTION = "This package includes the documentation for texlive-gentombow"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64333"

RPM_NAME = "texlive-gentombow-doc-2023.201.svn64333-52.1.noarch.rpm"
RPM_HASH = "6957bed3b205b3c8d6ffdc86fa04dee86d57dd155a705987ee520b0a4503d0a96e47f538db6228212a7e4a0cff26b2a83583d97af8e70608eaea7fa3e7fb72fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gentombow-doc-ja \
texlive-gentombow-doc"

RDEPENDS:${PN} += ""

inherit rpm
