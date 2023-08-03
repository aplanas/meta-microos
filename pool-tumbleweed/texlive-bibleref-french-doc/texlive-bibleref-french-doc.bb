SUMMARY = "Documentation for texlive-bibleref-french"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.3svn53138"

RPM_NAME = "texlive-bibleref-french-doc-2023.209.2.3.3svn53138-54.1.noarch.rpm"
RPM_HASH = "e88dacda3ad80e732f6599bbdc9e582eddf56d0df65a288acc855d5974c8e2ec1fa652d2b42fd0b18ef6038189a1d76e23121d2ac4116814b2540e310104350d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bibleref-french-doc-fr;en \
texlive-bibleref-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
