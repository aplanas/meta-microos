SUMMARY = "Correct placement of accents in sans-serif maths"
DESCRIPTION = "Sans serif maths (produced by the beamer class or the sfmath \
package) often has accents positioned incorrectly. This package \
fixes the positioning of such accents when the default font \
(cmssi) is used for sans serif maths. It will have no effect if \
used in a document that does not use the beamer class or the \
sfmath package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53628"

RPM_NAME = "texlive-sansmathaccent-2023.209.svn53628-54.1.noarch.rpm"
RPM_HASH = "55e8ee1fe1838c4762dbac72fc53abf74a938ca4aaa16513769b1fb461f97b97d7be67ceabc65687856d5272042d850d7bd519ea39680090b37f14a15f1d817f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathkerncmssi10.tfm \
tex-mathkerncmssi12.tfm \
tex-mathkerncmssi17.tfm \
tex-mathkerncmssi8.tfm \
tex-mathkerncmssi9.tfm \
tex-mathkerncmssxi10.tfm \
tex-mathkerncmssxi10.vf \
tex-mathkerncmssxi12.tfm \
tex-mathkerncmssxi12.vf \
tex-mathkerncmssxi17.tfm \
tex-mathkerncmssxi17.vf \
tex-mathkerncmssxi8.tfm \
tex-mathkerncmssxi8.vf \
tex-mathkerncmssxi9.tfm \
tex-mathkerncmssxi9.vf \
tex-ot1mathkerncmss.fd \
tex-sansmathaccent.map \
tex-sansmathaccent.sty \
texlive-sansmathaccent"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmssbx10.tfm \
tex-ecso0800.tfm \
tex-ecso0900.tfm \
tex-ecso1000.tfm \
tex-ecso1200.tfm \
tex-ecso1728.tfm \
tex-scrlfile.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
