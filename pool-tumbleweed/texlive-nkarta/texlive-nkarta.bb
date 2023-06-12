SUMMARY = "A 'new' version of the karta cartographic fonts"
DESCRIPTION = "A development of the karta font, offering more mathematical \
stability in Metafont. A version that will produce the glyphs \
as Encapsulated PostScript, using MetaPost, is also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn16437"

RPM_NAME = "texlive-nkarta-2023.201.0.0.2svn16437-54.1.noarch.rpm"
RPM_HASH = "974a774c64d0a96ec5fab7dcc30d669ecd1115ee6dbf8b77afbac9fa2f5eeb2f506a69aa94bd66cf71c87a804659686eec8d4acbbb88951bba83a568ae0b629f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nkarta15.tfm) \
texlive-nkarta"
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
