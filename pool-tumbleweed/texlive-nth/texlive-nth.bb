SUMMARY = "Generate English ordinal numbers"
DESCRIPTION = "The command \\nth{<number>} generates English ordinal numbers of \
the form 1st, 2nd, 3rd, 4th, etc. LaTeX package options may \
specify that the ordinal mark be superscripted, and that \
negative numbers may be treated; Plain TeX users have no access \
to package options, so need to redefine macros for these \
changes."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn54252"

RPM_NAME = "texlive-nth-2023.209.svn54252-55.1.noarch.rpm"
RPM_HASH = "0035eb610b849a1f9da9a3a0f74a537b95f317c0469db6f42d40958914c1453d4f30b88a9b89ee722fbfa107dd2bce45e7878d208fbc7476da6968cd1d2c3ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nth.sty \
texlive-nth"

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
