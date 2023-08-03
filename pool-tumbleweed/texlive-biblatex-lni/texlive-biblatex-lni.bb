SUMMARY = "LNI style for BibLaTeX"
DESCRIPTION = "BibLaTeX style for the Lecture Notes in Informatics, which is \
published by the Gesellschaft fur Informatik (GI e.V.)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn61719"

RPM_NAME = "texlive-biblatex-lni-2023.209.0.0.5svn61719-54.1.noarch.rpm"
RPM_HASH = "6d3b0ce9c06b8113891492de66476d6b87133042817aa1aab7237483ab656cbcb380092b5eed2bff6095f01fb5a14cb4287d5bba2f8e8c223de94ef90f4397fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LNI-english.lbx \
tex-LNI-ngerman.lbx \
tex-LNI.bbx \
tex-LNI.cbx \
texlive-biblatex-lni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.bbx \
tex-alphabetic.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
