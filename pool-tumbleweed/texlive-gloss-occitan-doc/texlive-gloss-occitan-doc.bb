SUMMARY = "Documentation for texlive-gloss-occitan"
DESCRIPTION = "This package includes the documentation for texlive-gloss-occitan"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-doc-2023.201.0.0.1svn52593-53.1.noarch.rpm"
RPM_HASH = "66ce4332f3f80035235dea974ec68274725e51d7cd7a305142adbe2e917587c19b34cf295df2a60f9667b3b1add18e36fb6753464a19aa30d4ecb7c1bf25ba76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
