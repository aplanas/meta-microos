SUMMARY = "Documentation for texlive-beaulivre"
DESCRIPTION = "This package includes the documentation for texlive-beaulivre"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-beaulivre-doc-2023.209.svn65475-54.1.noarch.rpm"
RPM_HASH = "7079a7cf0f5fa109f6e41886bf8905b809c7c8e970d8f00808777ce83c3dd21ec4f492218e91b55656730ba6b7d2607b67fdce9d0edf1c135674ab6ef2e6730e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beaulivre-doc"

RDEPENDS:${PN} += ""

inherit rpm
