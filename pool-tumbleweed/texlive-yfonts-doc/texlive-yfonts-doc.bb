SUMMARY = "Documentation for texlive-yfonts"
DESCRIPTION = "This package includes the documentation for texlive-yfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn50755"

RPM_NAME = "texlive-yfonts-doc-2023.209.1.4svn50755-53.1.noarch.rpm"
RPM_HASH = "21fdc0f4afeebe5b0576eadbde00705d5293407e4c3f3455fa9c751eb682c1f586b3e5cc85c152d4c6f285258f4a6be983de67641acd867b096439ad48bcc3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
