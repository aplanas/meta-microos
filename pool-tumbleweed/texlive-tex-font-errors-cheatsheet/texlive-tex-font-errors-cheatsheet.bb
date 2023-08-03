SUMMARY = "Cheat sheet outlining the most common TeX font errors"
DESCRIPTION = "This is a compact three-pages document highlighting the TeX \
flow of integrating fonts, and explains how some of the most \
common font-related error messages occur. Also, hints are given \
on how to address those."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn18314"

RPM_NAME = "texlive-tex-font-errors-cheatsheet-2023.209.0.0.1svn18314-55.1.noarch.rpm"
RPM_HASH = "bd2d290938a0b6063d40729386803845be4ee303b7f21cc7558620a2011647d683fae6569f936975eb5f71720172ce7605a26e44e89faa705e65219d2f312042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-font-errors-cheatsheet"

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
