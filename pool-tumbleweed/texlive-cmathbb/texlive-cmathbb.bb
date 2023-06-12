SUMMARY = "Computer modern mathematical blackboard bold font"
DESCRIPTION = "This font contains all digits and latin letters uppercase and \
lowercase for the Computer Modern font family in blackboard \
bold."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56414"

RPM_NAME = "texlive-cmathbb-2023.201.1.0svn56414-53.1.noarch.rpm"
RPM_HASH = "8d4741133412800ff9be0773e00fe57bb16d2d25c320c9e048f32891f6a9edd29eef2b61cc543fa34b94994d9a5e65d985b87fd109380d290eb819a0d1c9e348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(a_ghauqe.enc) \
tex(a_jggq4p.enc) \
tex(a_ns6ls2.enc) \
tex(a_szuv3s.enc) \
tex(cmathbb-Regular-tlf-ly1--base.tfm) \
tex(cmathbb-Regular-tlf-ly1--lcdfj.tfm) \
tex(cmathbb-Regular-tlf-ly1.tfm) \
tex(cmathbb-Regular-tlf-ly1.vf) \
tex(cmathbb-Regular-tlf-ot1--base.tfm) \
tex(cmathbb-Regular-tlf-ot1--lcdfj.tfm) \
tex(cmathbb-Regular-tlf-ot1.tfm) \
tex(cmathbb-Regular-tlf-ot1.vf) \
tex(cmathbb-Regular-tlf-t1--base.tfm) \
tex(cmathbb-Regular-tlf-t1--lcdfj.tfm) \
tex(cmathbb-Regular-tlf-t1.tfm) \
tex(cmathbb-Regular-tlf-t1.vf) \
tex(cmathbb-Regular-tlf-ts1--base.tfm) \
tex(cmathbb-Regular-tlf-ts1.tfm) \
tex(cmathbb-Regular-tlf-ts1.vf) \
tex(cmathbb.map) \
tex(cmathbb.sty) \
tex(ucmath.fd) \
texlive-cmathbb"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(updmap.cfg) \
texlive \
texlive-cmathbb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
