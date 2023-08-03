SUMMARY = "Case conversion ignoring mathematics, etcetera"
DESCRIPTION = "The textcase package offers commands \\MakeTextUppercase and \
\\MakeTextLowercase which are similar to the standard \
\\MakeUppercase and \\MakeLowercase, but they do not change the \
case of any sections of mathematics, or the arguments of \\cite, \
\\label and \\ref commands within the argument. A further command \
\\NoCaseChange does nothing but suppress case change within its \
argument, so to force uppercase of a section including an \
environment, one might say: \
\\MakeTextUppercase{...\\NoCaseChange{\\begin{foo}} \
...\\NoCaseChange{\\end{foo}}...} In current LaTeX this package \
is obsolete. You can use the standard \\MakeUppercase and \
\\MakeLowercase, but it defines legacy names \\MakeTextUppercase \
and \\MakeTextLowercase."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn63868"

RPM_NAME = "texlive-textcase-2023.209.1.03svn63868-55.1.noarch.rpm"
RPM_HASH = "7705734eaff604119070a9eae809648355d554fa625f083ed6518033aeb05e5caa05568358c336105acff6d6683edcf71b5554cd31e0ea1101782759c754c339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textcase.sty \
texlive-textcase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
