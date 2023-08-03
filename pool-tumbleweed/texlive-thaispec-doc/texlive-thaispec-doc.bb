SUMMARY = "Documentation for texlive-thaispec"
DESCRIPTION = "This package includes the documentation for texlive-thaispec"
LICENSE = "LPPL-1.0"

PV = "2023.209.2021.03.01svn58019"

RPM_NAME = "texlive-thaispec-doc-2023.209.2021.03.01svn58019-55.1.noarch.rpm"
RPM_HASH = "37048eff47decdc2c99dacf9001d0966236ee81fabc2f790a34e5449a7cb645f9c061b3a271d099170ae0cd3593e68717c9dcb86674a4553631c4913fef2ebfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thaispec-doc-th \
texlive-thaispec-doc"

RDEPENDS:${PN} += ""

inherit rpm
