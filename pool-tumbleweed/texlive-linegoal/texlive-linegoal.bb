SUMMARY = "A 'dimen' that returns the space left on the line"
DESCRIPTION = "The linegoal package provides a macro \\linegoal to be used with \
\\setlength: \\setlength<some dimen>\\linegoal will set <some \
dimen> to the horizontal length of the remainder of the line. \
This is achieved using the \\pdfsavepos primitive of pdfTeX, \
through the zref-savepos package. Example: Some text: \
\\begin{tabularx}\\linegoal{|l|X|} \\hline one & two \\\\ three & \
four \\\\\\hline \\end{tabularx} will position the table after the \
initial text, and make the table fill the rest of the line."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn21523"

RPM_NAME = "texlive-linegoal-2023.209.2.9svn21523-55.1.noarch.rpm"
RPM_HASH = "34483133c35e1d1a8fc650894469bfddfb88ab037146c4090a27f1608f28d1ebde4e9a52e85b142f175f9c88d8c8c3ed1b5f67d79900dac5ec19a8ebb7cb7c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linegoal.sty \
texlive-linegoal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-zref-savepos.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
