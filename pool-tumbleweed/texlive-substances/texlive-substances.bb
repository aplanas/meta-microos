SUMMARY = "A database of chemicals"
DESCRIPTION = "The package provides the means to create a database-like file \
that contains data of various chemicals. These data may be \
retrieved in the document; an index of the chemicals mentioned \
in the document can be created.."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn40989"

RPM_NAME = "texlive-substances-2023.209.0.0.2asvn40989-58.1.noarch.rpm"
RPM_HASH = "8553600da7b67c7f386ee162d7deeb01bff4c7e7969e74984b3d2b2b8d1d494056651c2906a065048bb61a343814ef86a10a4175b067b8e35795761192a35bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-substances-default.def \
tex-substances.sty \
texlive-substances"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemfig.sty \
tex-chemmacros.sty \
tex-expl3.sty \
tex-ghsystem.sty \
tex-l3keys2e.sty \
tex-siunitx.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
