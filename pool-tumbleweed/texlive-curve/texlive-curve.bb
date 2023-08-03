SUMMARY = "A class for making curriculum vitae"
DESCRIPTION = "CurVe is a class for writing a CV, with configuration for the \
language in which you write. The class provides a set of \
commands to create rubrics, entries in these rubrics etc. CurVe \
then format the CV (possibly splitting it onto multiple pages, \
repeating the titles etc), which is usually the most painful \
part of CV writing. Another nice feature of CurVe is its \
ability to manage different CV 'flavours' simultaneously. It is \
often the case that you want to maintain slightly divergent \
versions of your CV at the same time, in order to emphasize on \
different aspects of your background. CurVe also comes with \
support for use with AUC-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.16svn20745"

RPM_NAME = "texlive-curve-2023.209.1.16svn20745-55.1.noarch.rpm"
RPM_HASH = "a31c2cd0709622e1ab745330a5bd657b782e11559cbabfe671e35ec43f4aa0abe0c595a7ece019791654500080d1d89071302e7ae08b0fc3b251ecc6ca27f0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curve.cls \
texlive-curve"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-filehook.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-ltxtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
