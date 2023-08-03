SUMMARY = "Support for automation of the LaTeX workflow"
DESCRIPTION = "The package helps to automate a typical LaTeX workflow that \
involves running LaTeX several times, running tools such as \
BibTeX or makeindex, and so on. It will log requests like \
'please rerun LaTeX' or 'please run BibTeX on file X' to an \
external XML file which lists all open tasks in a \
machine-readable format. Compiler scripts and integrated LaTeX \
editing environments may parse this file to determine the next \
steps in the workflow in a way that is more efficient than \
parsing the main log file. In sum, the package will do two \
things: enable package authors to use LaTeX commands to issue \
requests, collect all requests from all packages and write them \
to an external XML file at the end of the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn53003"

RPM_NAME = "texlive-logreq-2023.209.1.0svn53003-55.1.noarch.rpm"
RPM_HASH = "04f3a48a1872c69a7addcb4de92d74644880af35695eb163b27586ce9f36b75df6ed67def17c0f6bbb3c1cf96d5e69f2481fab1e29f62e7083652c541ff55901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logreq.def \
tex-logreq.sty \
texlive-logreq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-keyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
