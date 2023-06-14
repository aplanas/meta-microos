SUMMARY = "Named mark registers with e-TeX"
DESCRIPTION = "E-TeX provides 32 768 mark registers; using this facility is \
far more comfortable than LaTeX tricks with \\markright, \
\\markboth, \\leftmark and \\rightmark. The package provides two \
commands for marking: \\marksthe and \\marksthecs, which have * \
forms which disable expansion; new mark registers are allocated \
as needed. Syntax is closely modelled on the \\marks primitive. \
Four commands are provided for retrieving the marks registers' \
content: \\thefirstmarks, \\thebotmarks, thetopmarks and \
\\getthemarks; and the command \\ifmarksequal is available for \
comparing the content of marks registers. The package requires \
an e-TeX-enabled engine, and the etex package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24504"

RPM_NAME = "texlive-emarks-2023.201.1.0svn24504-53.1.noarch.rpm"
RPM_HASH = "7288d259b40cd55a3e287bf66345115cb99d29f502c321c51822bc2dab5e346ee52e2fe920f096d4c2261b7fcfb08a0131c3ee528aa6159f1ef3efaebc8e5bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emarks.sty \
texlive-emarks"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
