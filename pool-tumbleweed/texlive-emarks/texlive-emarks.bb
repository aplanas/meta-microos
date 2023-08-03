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

PV = "2023.209.1.0svn24504"

RPM_NAME = "texlive-emarks-2023.209.1.0svn24504-54.1.noarch.rpm"
RPM_HASH = "076611dc5baac2352b662e7033796ec91c26b2e0570c5e02d45f89481e76407694eea01f1ce99bfc06d56a419b44588cc9afabcc25c5849e9f399f224a91c4d8"
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
