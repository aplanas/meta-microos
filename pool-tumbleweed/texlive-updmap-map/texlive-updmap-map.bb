SUMMARY = "Auto-generated font map files"
DESCRIPTION = "These map files are regenerated every time a new font is added. \
There is no need to rebuild formats or update binaries because \
of such updates, hence this separate package."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54495"

RPM_NAME = "texlive-updmap-map-2023.208.svn54495-58.1.noarch.rpm"
RPM_HASH = "d169b75896b4dace65e10fc126491ee3d6222eb739fbb46a86bbe4b1acebcf6c33b309a5f61d0278337a9c0e26da23c0828f88652fe36e38c8ca9d562006413c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(builtin35.map) \
tex(download35.map) \
tex(kanjix.map) \
tex(pdftex.map) \
tex(pdftex_dl14.map) \
tex(pdftex_ndl14.map) \
tex(ps2pk.map) \
tex(psfonts.map) \
tex(psfonts_pk.map) \
tex(psfonts_t1.map) \
texlive-updmap-map"

RDEPENDS:${PN} += "/bin/sh \
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
