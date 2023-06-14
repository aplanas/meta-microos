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

PV = "2023.201.1.02svn63867"

RPM_NAME = "texlive-sidenotesplus-2023.201.1.02svn63867-53.1.noarch.rpm"
RPM_HASH = "20a1877fd05671fc81f119a3604fe6f8f27f2f6bbdb1c5fe7ac99e20f372b2f2205b07b994650cd1981d5e24e041dba67a9675fdf1cbc4baa275ab5ee5724ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidenotesplus.sty \
texlive-sidenotesplus"

RDEPENDS:${PN} += "/bin/sh \
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
