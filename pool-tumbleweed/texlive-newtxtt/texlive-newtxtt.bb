SUMMARY = "Enhancement of typewriter fonts from newtx"
DESCRIPTION = "The package provides enhanced fonts with LaTeX support files \
providing access to the typewriter fonts from newtx. Regular \
and bold weights, slanted variants and a choice of four \
different styles for zero."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.056svn54512"

RPM_NAME = "texlive-newtxtt-2023.201.1.056svn54512-54.1.noarch.rpm"
RPM_HASH = "bc670cdbbdfe361f50d5cdd5438706a28957ef6a2bf983b7a1695f4261160e6bb11c13d1967f2fe6d6bdf024fc7b7eaefb6914394bdaa2bfaa0bf6611a209bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newtxbtta.tfm \
tex-newtxbttaq.tfm \
tex-newtxbttb.tfm \
tex-newtxbttbq.tfm \
tex-newtxbttc.tfm \
tex-newtxbttcq.tfm \
tex-newtxbttd.tfm \
tex-newtxbttdq.tfm \
tex-newtxbtte.tfm \
tex-newtxbtteq.tfm \
tex-newtxbttsca.tfm \
tex-newtxbttscaq.tfm \
tex-newtxbttscb.tfm \
tex-newtxbttscbq.tfm \
tex-newtxbttscc.tfm \
tex-newtxbttsccq.tfm \
tex-newtxbttscd.tfm \
tex-newtxbttscdq.tfm \
tex-newtxbttsce.tfm \
tex-newtxbttsceq.tfm \
tex-newtxbttsla.tfm \
tex-newtxbttslaq.tfm \
tex-newtxbttslb.tfm \
tex-newtxbttslbq.tfm \
tex-newtxbttslc.tfm \
tex-newtxbttslcq.tfm \
tex-newtxbttsld.tfm \
tex-newtxbttsldq.tfm \
tex-newtxbttsle.tfm \
tex-newtxbttsleq.tfm \
tex-newtxbttza.tfm \
tex-newtxbttzaq.tfm \
tex-newtxbttzb.tfm \
tex-newtxbttzbq.tfm \
tex-newtxbttzc.tfm \
tex-newtxbttzcq.tfm \
tex-newtxbttzd.tfm \
tex-newtxbttzdq.tfm \
tex-newtxbttze.tfm \
tex-newtxbttzeq.tfm \
tex-newtxbttzsca.tfm \
tex-newtxbttzscaq.tfm \
tex-newtxbttzscb.tfm \
tex-newtxbttzscbq.tfm \
tex-newtxbttzscc.tfm \
tex-newtxbttzsccq.tfm \
tex-newtxbttzscd.tfm \
tex-newtxbttzscdq.tfm \
tex-newtxbttzsce.tfm \
tex-newtxbttzsceq.tfm \
tex-newtxbttzsla.tfm \
tex-newtxbttzslaq.tfm \
tex-newtxbttzslb.tfm \
tex-newtxbttzslbq.tfm \
tex-newtxbttzslc.tfm \
tex-newtxbttzslcq.tfm \
tex-newtxbttzsld.tfm \
tex-newtxbttzsldq.tfm \
tex-newtxbttzsle.tfm \
tex-newtxbttzsleq.tfm \
tex-newtxtt.map \
tex-newtxtt.sty \
tex-newtxtta.tfm \
tex-newtxttaq.tfm \
tex-newtxttb.tfm \
tex-newtxttbq.tfm \
tex-newtxttc.tfm \
tex-newtxttcq.tfm \
tex-newtxttd.tfm \
tex-newtxttdq.tfm \
tex-newtxtte.tfm \
tex-newtxtteq.tfm \
tex-newtxttsca.tfm \
tex-newtxttscaq.tfm \
tex-newtxttscb.tfm \
tex-newtxttscbq.tfm \
tex-newtxttscc.tfm \
tex-newtxttsccq.tfm \
tex-newtxttscd.tfm \
tex-newtxttscdq.tfm \
tex-newtxttsce.tfm \
tex-newtxttsceq.tfm \
tex-newtxttsla.tfm \
tex-newtxttslaq.tfm \
tex-newtxttslb.tfm \
tex-newtxttslbq.tfm \
tex-newtxttslc.tfm \
tex-newtxttslcq.tfm \
tex-newtxttsld.tfm \
tex-newtxttsldq.tfm \
tex-newtxttsle.tfm \
tex-newtxttsleq.tfm \
tex-newtxttza.tfm \
tex-newtxttzaq.tfm \
tex-newtxttzb.tfm \
tex-newtxttzbq.tfm \
tex-newtxttzc.tfm \
tex-newtxttzcq.tfm \
tex-newtxttzd.tfm \
tex-newtxttzdq.tfm \
tex-newtxttze.tfm \
tex-newtxttzeq.tfm \
tex-newtxttzsca.tfm \
tex-newtxttzscaq.tfm \
tex-newtxttzscb.tfm \
tex-newtxttzscbq.tfm \
tex-newtxttzscc.tfm \
tex-newtxttzsccq.tfm \
tex-newtxttzscd.tfm \
tex-newtxttzscdq.tfm \
tex-newtxttzsce.tfm \
tex-newtxttzsceq.tfm \
tex-newtxttzsla.tfm \
tex-newtxttzslaq.tfm \
tex-newtxttzslb.tfm \
tex-newtxttzslbq.tfm \
tex-newtxttzslc.tfm \
tex-newtxttzslcq.tfm \
tex-newtxttzsld.tfm \
tex-newtxttzsldq.tfm \
tex-newtxttzsle.tfm \
tex-newtxttzsleq.tfm \
tex-t1newtxtt.fd \
tex-t1newtxttz.fd \
tex-tcxbttz.tfm \
tex-tcxbttzsl.tfm \
tex-tcxttz.tfm \
tex-tcxttzsl.tfm \
tex-ts1newtxtt.fd \
tex-ts1newtxttz.fd \
tex-txttAec.enc \
tex-txttAqec.enc \
tex-txttBec.enc \
tex-txttBqec.enc \
tex-txttCec.enc \
tex-txttCqec.enc \
tex-txttDec.enc \
tex-txttDqec.enc \
tex-txttEec.enc \
tex-txttEqec.enc \
texlive-newtxtt"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newtxtt-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
