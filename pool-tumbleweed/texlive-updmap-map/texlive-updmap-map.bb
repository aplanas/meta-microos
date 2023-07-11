SUMMARY = "Auto-generated font map files"
DESCRIPTION = "These map files are regenerated every time a new font is added. \
There is no need to rebuild formats or update binaries because \
of such updates, hence this separate package."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54495"

RPM_NAME = "texlive-updmap-map-2023.208.svn54495-60.1.noarch.rpm"
RPM_HASH = "21bedefe034ac8c371e9aca14822dc8648925852323d0618624797b580b858e5adab198a427452a89918c8684a222f640687ad16513b2b0cc631674c461a962f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-builtin35.map \
tex-download35.map \
tex-kanjix.map \
tex-pdftex-dl14.map \
tex-pdftex-ndl14.map \
tex-pdftex.map \
tex-ps2pk.map \
tex-psfonts-pk.map \
tex-psfonts-t1.map \
tex-psfonts.map \
texlive-updmap-map"

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
