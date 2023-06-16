SUMMARY = "Polish extension of Computer Modern fonts"
DESCRIPTION = "The Polish extension of the Computer Modern fonts (compatible \
with CM itself) for use with Polish TeX formats. The fonts were \
originally a part of the MeX distribution (and they are still \
available that way)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.09asvn58661"

RPM_NAME = "texlive-pl-2023.201.1.09asvn58661-51.1.noarch.rpm"
RPM_HASH = "75cf295596457413642119c24f94d8306c29efabc8d7d59fe6674e0008cccd0eb368279e76a2e94c0e5395e8bc24e64b9c414291d51b2621391f4b1666ed79c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plb10.tfm \
tex-plbsy10.tfm \
tex-plbsy5.tfm \
tex-plbsy7.tfm \
tex-plbx10.tfm \
tex-plbx12.tfm \
tex-plbx5.tfm \
tex-plbx6.tfm \
tex-plbx7.tfm \
tex-plbx8.tfm \
tex-plbx9.tfm \
tex-plbxsl10.tfm \
tex-plbxti10.tfm \
tex-plcsc10.tfm \
tex-pldunh10.tfm \
tex-plex10.tfm \
tex-plex9.tfm \
tex-plff10.tfm \
tex-plfi10.tfm \
tex-plfib8.tfm \
tex-plin.enc \
tex-plinch.tfm \
tex-plit.enc \
tex-plitt.enc \
tex-plitt10.tfm \
tex-plme.enc \
tex-plmi.enc \
tex-plmi10.tfm \
tex-plmi12.tfm \
tex-plmi5.tfm \
tex-plmi6.tfm \
tex-plmi7.tfm \
tex-plmi8.tfm \
tex-plmi9.tfm \
tex-plmib10.tfm \
tex-plmib5.tfm \
tex-plmib7.tfm \
tex-plms.enc \
tex-plother.map \
tex-plr10.tfm \
tex-plr12.tfm \
tex-plr17.tfm \
tex-plr5.tfm \
tex-plr6.tfm \
tex-plr7.tfm \
tex-plr8.tfm \
tex-plr9.tfm \
tex-plrm.enc \
tex-plsc.enc \
tex-plsl10.tfm \
tex-plsl12.tfm \
tex-plsl8.tfm \
tex-plsl9.tfm \
tex-plsltt10.tfm \
tex-plss10.tfm \
tex-plss12.tfm \
tex-plss17.tfm \
tex-plss8.tfm \
tex-plss9.tfm \
tex-plssbi10.tfm \
tex-plssbx10.tfm \
tex-plssdc10.tfm \
tex-plssi10.tfm \
tex-plssi12.tfm \
tex-plssi17.tfm \
tex-plssi8.tfm \
tex-plssi9.tfm \
tex-plssq8.tfm \
tex-plssqi8.tfm \
tex-plsy10.tfm \
tex-plsy5.tfm \
tex-plsy6.tfm \
tex-plsy7.tfm \
tex-plsy8.tfm \
tex-plsy9.tfm \
tex-pltcsc10.tfm \
tex-plte.enc \
tex-pltex10.tfm \
tex-pltex8.tfm \
tex-pltex9.tfm \
tex-pltext.map \
tex-plti10.tfm \
tex-plti12.tfm \
tex-plti7.tfm \
tex-plti8.tfm \
tex-plti9.tfm \
tex-pltt.enc \
tex-pltt10.tfm \
tex-pltt12.tfm \
tex-pltt8.tfm \
tex-pltt9.tfm \
tex-plu10.tfm \
tex-plvtt10.tfm \
texlive-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pl-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
