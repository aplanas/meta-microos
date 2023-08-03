SUMMARY = "Documentation for texlive-biblatex-trad"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-trad"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn58169"

RPM_NAME = "texlive-biblatex-trad-doc-2023.209.0.0.5svn58169-54.1.noarch.rpm"
RPM_HASH = "f0185d869c55ff9581a8981311724b2b160dad2eb35ae3a0f728b9790907b96ed56887b1e230debbe6f4b19771ddfba17f060e5069e50634dc2b6643f11b55c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-trad-doc"

RDEPENDS:${PN} += ""

inherit rpm
