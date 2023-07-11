SUMMARY = "Fonts for use with pTeX"
DESCRIPTION = "The bundle contains fonts for use with pTeX and the documents \
for the makejvf program. This is a redistribution derived from \
the ptex-texmf distribution by ASCII MEDIA WORKS."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64330"

RPM_NAME = "texlive-ptex-fonts-2023.201.svn64330-53.2.noarch.rpm"
RPM_HASH = "23170f253327a824b61cca8f595dd314328396e7c16da672e17d00c315d297b36ddea3666c964b46ccf19da8e36c762a66e367d29e6bda5a5fe7c7fe78c8ca1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gbm.tfm \
tex-gbmv.tfm \
tex-goth10.tfm \
tex-goth10.vf \
tex-goth5.tfm \
tex-goth5.vf \
tex-goth6.tfm \
tex-goth6.vf \
tex-goth7.tfm \
tex-goth7.vf \
tex-goth8.tfm \
tex-goth8.vf \
tex-goth9.tfm \
tex-goth9.vf \
tex-jis-v.tfm \
tex-jis-v.vf \
tex-jis.tfm \
tex-jis.vf \
tex-jisg-v.tfm \
tex-jisg-v.vf \
tex-jisg.tfm \
tex-jisg.vf \
tex-jisgn-v.tfm \
tex-jisgn-v.vf \
tex-jisgn.tfm \
tex-jisgn.vf \
tex-jisn-v.tfm \
tex-jisn-v.vf \
tex-jisn.tfm \
tex-jisn.vf \
tex-min10.tfm \
tex-min10.vf \
tex-min5.tfm \
tex-min5.vf \
tex-min6.tfm \
tex-min6.vf \
tex-min7.tfm \
tex-min7.vf \
tex-min8.tfm \
tex-min8.vf \
tex-min9.tfm \
tex-min9.vf \
tex-ngoth10.tfm \
tex-ngoth10.vf \
tex-ngoth5.tfm \
tex-ngoth5.vf \
tex-ngoth6.tfm \
tex-ngoth6.vf \
tex-ngoth7.tfm \
tex-ngoth7.vf \
tex-ngoth8.tfm \
tex-ngoth8.vf \
tex-ngoth9.tfm \
tex-ngoth9.vf \
tex-nmin10.tfm \
tex-nmin10.vf \
tex-nmin5.tfm \
tex-nmin5.vf \
tex-nmin6.tfm \
tex-nmin6.vf \
tex-nmin7.tfm \
tex-nmin7.vf \
tex-nmin8.tfm \
tex-nmin8.vf \
tex-nmin9.tfm \
tex-nmin9.vf \
tex-rml.tfm \
tex-rmlv.tfm \
tex-tgoth10.tfm \
tex-tgoth10.vf \
tex-tgoth5.tfm \
tex-tgoth5.vf \
tex-tgoth6.tfm \
tex-tgoth6.vf \
tex-tgoth7.tfm \
tex-tgoth7.vf \
tex-tgoth8.tfm \
tex-tgoth8.vf \
tex-tgoth9.tfm \
tex-tgoth9.vf \
tex-tmin10.tfm \
tex-tmin10.vf \
tex-tmin5.tfm \
tex-tmin5.vf \
tex-tmin6.tfm \
tex-tmin6.vf \
tex-tmin7.tfm \
tex-tmin7.vf \
tex-tmin8.tfm \
tex-tmin8.vf \
tex-tmin9.tfm \
tex-tmin9.vf \
texlive-ptex-fonts"

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
