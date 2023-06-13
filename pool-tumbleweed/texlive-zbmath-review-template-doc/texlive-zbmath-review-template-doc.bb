SUMMARY = "Documentation for texlive-zbmath-review-template"
DESCRIPTION = "This package includes the documentation for texlive-zbmath-review-template"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-doc-2023.201.2.1svn59693-52.1.noarch.rpm"
RPM_HASH = "4cc1b7c47ab30c9c917d0db25edd088a925e4b2bdb053d438b94da9f4680c8dd8f683ef998dd8165ca8a5ad03ef326cba384924bac1d95482a812d35fb3977d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zbmath-review-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
