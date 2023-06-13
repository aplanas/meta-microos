SUMMARY = "Draw signal flow graphs"
DESCRIPTION = "Defines some commands to draw signal flow graphs as used by \
electrical and electronics engineers and graph theorists. \
Requires fp and pstricks packages (and a relatively fast \
machine)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn20209"

RPM_NAME = "texlive-sfg-2023.201.0.0.91svn20209-53.1.noarch.rpm"
RPM_HASH = "4fc73b978574be0d7df5982a6d5fcfd704a8c707a48f8ed2f95dca7915a5eca102e22ab7643de3a74f189a7e0574c69b29979253d73e15917a68dcf70f4f5bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sfg.sty) \
texlive-sfg"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
