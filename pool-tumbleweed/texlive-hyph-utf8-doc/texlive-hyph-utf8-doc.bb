SUMMARY = "Documentation for texlive-hyph-utf8"
DESCRIPTION = "This package includes the documentation for texlive-hyph-utf8"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-hyph-utf8-doc-2023.209.svn61719-54.1.noarch.rpm"
RPM_HASH = "85f7b7c2df760c36807838c4baea00ede8773614dde5d25aaa6291097a8ac45edf87ec01318ff63d29f0d4abc058b569e4ff4f1ad6844cb734651b368824637b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyph-utf8-doc-en \
texlive-hyph-utf8-doc"

RDEPENDS:${PN} += ""

inherit rpm
