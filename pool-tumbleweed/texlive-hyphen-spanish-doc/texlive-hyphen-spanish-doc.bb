SUMMARY = "Documentation for texlive-hyphen-spanish"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn58652"

RPM_NAME = "texlive-hyphen-spanish-doc-2023.201.5.0svn58652-52.1.noarch.rpm"
RPM_HASH = "554cf01e858830eeb2a7f3559db68388b2d9efee76a5491036287dd9720bd7ed004f155bb016d257cdc5f5263eeba8e0398b4918b864e437e97642a6d83d507b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hyphen-spanish-doc:es) \
texlive-hyphen-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
