SUMMARY = "Place referenced notes, alerts, figures and tables into the document margin"
DESCRIPTION = "Sidenotesplus is a comprehensive package for placing labeled or \
referenced notes, temporary alerts, bibliography references, \
figures and tables into the margin. Marginals can be either \
floated or at fixed positions relative to the text. Twoside \
symmetry is preserved. For BibLaTeX users, macros for side \
references are provided. Three margin styles are provided. \
Two-page symmetric layouts either as (i) Ragged outer with note \
reverences in the margin separator or (ii) justified with last \
line ragged outer. And (iii) a classic look, justified with \
last line ragged right and note reference to the left of the \
note, but two-page symmetry is lost. The command \\sidenote \
mimics the \\footnote command and provides labelled (numbers, \
alphabetic, roman) references. However, un-numbered and custom \
symbols can also be specified. Temporary sidealerts are \
rendered only if the package option alerton is specified. \
Alerts are useful as to do reminders during document \
development. Furthermore, captions for figures and tables can \
also be placed into margin. Also, full width environments for \
figures, tables and text are provided. The text environment can \
be partially widened, suitable if that extra space for an \
equation is required."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn63867"

RPM_NAME = "texlive-sidenotesplus-2023.209.1.02svn63867-54.1.noarch.rpm"
RPM_HASH = "c2bc54d7f3a989e926e08fa0e195ab8dbf6f96bdf663ff773c044fa8c30a408ec17065ee4aabb2bc3b623c98a775e72ed022a96aa5bccd18dbe83afe8f542536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidenotesplus.sty \
texlive-sidenotesplus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-caption.sty \
tex-changepage.sty \
tex-etoolbox.sty \
tex-ifoddpage.sty \
tex-l3keys2e.sty \
tex-marginnote.sty \
tex-mparhack.sty \
tex-ragged2e.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
