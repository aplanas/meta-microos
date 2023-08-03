SUMMARY = "Documentation for texlive-lilyglyphs"
DESCRIPTION = "This package includes the documentation for texlive-lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-doc-2023.209.0.0.2.4svn56473-55.1.noarch.rpm"
RPM_HASH = "64311ebf57ef7b171d7170943cccf1dd0bb3ae0404e3530da9d97ee49b64f2550c01362d269a75a44cc85cd6e3c5d3b838c43456437fc27334cb851509d5de9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lilyglyphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
