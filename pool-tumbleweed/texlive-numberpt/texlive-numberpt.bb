SUMMARY = "Counters spelled out in Portuguese"
DESCRIPTION = "This packages defines commands to display counters spelled out \
in Portuguese. The styles are \\numberpt for 'all lowercase' \
\\Numberpt for 'First word capitalized' \\NumberPt for 'All \
Capitalized' \\NUMBERPT for 'ALL UPPERCASE' For example, \
\\renewcommand{\\thechapter}{\\NumberPt{chapter}} makes chapter \
titles to be rendered as 'Capitulo Um', 'Capitulo Dois' etc. \
Options are offered to select variations in the spelling of \
'14', or Brazilian vs. European Portuguese forms in the \
spelling of '16', '17', and '19'. The package requires expl3 \
and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51640"

RPM_NAME = "texlive-numberpt-2023.209.1.0svn51640-55.1.noarch.rpm"
RPM_HASH = "22cc99a34a8026ec6d6b44f47c309af195815829b411cf55107b78226bae543111ee67323564b507127a794c5c4a52c22da995a75af4c58f0c3d2de1199487ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numberpt.sty \
texlive-numberpt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
