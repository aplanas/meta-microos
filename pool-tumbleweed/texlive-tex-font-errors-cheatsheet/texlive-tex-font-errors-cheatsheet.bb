SUMMARY = "Cheat sheet outlining the most common TeX font errors"
DESCRIPTION = "This is a compact three-pages document highlighting the TeX \
flow of integrating fonts, and explains how some of the most \
common font-related error messages occur. Also, hints are given \
on how to address those."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn18314"

RPM_NAME = "texlive-tex-font-errors-cheatsheet-2023.201.0.0.1svn18314-54.1.noarch.rpm"
RPM_HASH = "4190c72884eaeea5f8eb64910608d155954700373ac29cd2ff1c125159d79b2b8ee1a9a53f1717e2204a8724eb48ed64133181e47ec2bd9c708c3e79d26003c0"
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
