SUMMARY = "Letters and faxes in French"
DESCRIPTION = "Developed from the ancestor of the standard letter class, at \
the Observatoire de Geneve."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.002svn54722"

RPM_NAME = "texlive-lettre-2023.209.3.002svn54722-55.1.noarch.rpm"
RPM_HASH = "e3c6d038945a3436c7fd84aba9df8ec3ff3e2d2177332de1266ca84cdb4a6ed9d881061561656c757c1edd8f25eafebb54284d85114b46b9c74f3ab139d78f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lettre-USenglish.ldf \
tex-lettre-amg.cfg \
tex-lettre-default.cfg \
tex-lettre-english.ldf \
tex-lettre-french.ldf \
tex-lettre-german.ldf \
tex-lettre-obs.cfg \
tex-lettre-romand.ldf \
tex-lettre.cls \
texlive-lettre"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
