SUMMARY = "Documentation for texlive-datetime2-en-fulltext"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-en-fulltext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36705"

RPM_NAME = "texlive-datetime2-en-fulltext-doc-2023.209.1.0svn36705-53.1.noarch.rpm"
RPM_HASH = "50039bb5df898f425f1a6946adb87e4ae7136af4ce73f39e421a3061581f9ec0752175bbe5e960e2c2d6218c0defaee5af66326b9da838d431b71bd934473726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-en-fulltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
