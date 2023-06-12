SUMMARY = "Documentation for texlive-bibleref-french"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.3svn53138"

RPM_NAME = "texlive-bibleref-french-doc-2023.201.2.3.3svn53138-53.1.noarch.rpm"
RPM_HASH = "e834ba6c501be3f21cb6ffb359d9add5c8840d909d1eaea7e9a590e1b90d0d44aa255ede64db99077c6f3a0491b2d68f0cfaae485a891e276cbcbd8bc1be5fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bibleref-french-doc:fr;en) \
texlive-bibleref-french-doc"
RDEPENDS:${PN} += ""

inherit rpm
