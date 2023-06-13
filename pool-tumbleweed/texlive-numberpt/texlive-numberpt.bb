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

PV = "2023.201.1.0svn51640"

RPM_NAME = "texlive-numberpt-2023.201.1.0svn51640-54.1.noarch.rpm"
RPM_HASH = "e943ab827fd91f50095a7d364e23bd53fae2018cb4baf709077b32b8bb5e1771919cf485729f9329dfdb622875f7529114ded219316958d27b447d9cf1c4a04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(numberpt.sty) \
texlive-numberpt"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
