SUMMARY = "Documentation for texlive-wadalab"
DESCRIPTION = "This package includes the documentation for texlive-wadalab"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42428"

RPM_NAME = "texlive-wadalab-doc-2023.209.svn42428-54.1.noarch.rpm"
RPM_HASH = "587d0e0a333a2db26896336f7e6b5ce912e8e256a53fef73e858be2e571037917ecee1c3b587c7bbd4912e97138a44570e6f45bba04218374a5898de0f7acaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wadalab-doc"

RDEPENDS:${PN} += ""

inherit rpm
