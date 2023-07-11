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

RPM_NAME = "texlive-emarks-2023.201.1.0svn24504-53.2.noarch.rpm"
RPM_HASH = "49d46793c333afbe0bdbb51f003764e53a2a7e7ca4c932011dfc96c1ac0697c8b7da0c850ec8bd4d5b4a9f0634970c6611e756f2555ac720efe1d6769c9d1809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emarks.sty \
texlive-emarks"

RDEPENDS:${PN} += "/usr/bin/sh \
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
