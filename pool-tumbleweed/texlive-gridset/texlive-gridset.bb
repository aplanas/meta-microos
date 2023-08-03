SUMMARY = "Grid, a.k.a. in-register, setting"
DESCRIPTION = "Grid setting -- also known as strict in-register setting -- is \
something, that should be done for a lot of documents but is \
not easy using LaTeX. The package helps to get the information \
needed for grid setting. It does not implement auto grid \
setting, but there is a command \\vskipnextgrid, that moves to \
the next grid position. This may be enough under some \
circumstances, but in other circumstances it may fail. Thus \
gridset is only one more step for grid setting, not a complete \
solution."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn53762"

RPM_NAME = "texlive-gridset-2023.209.0.0.3svn53762-54.1.noarch.rpm"
RPM_HASH = "723f4f829a1f0500841f59168838caae054b8c0a6d84fbf405299ef142f26f35736ba12c5baac36ecc39c7b2f16f20d4df85647219b67ac83ee789e2cb6b332f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridset.sty \
texlive-gridset"

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
