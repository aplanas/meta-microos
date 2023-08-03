SUMMARY = "Computer modern mathematical blackboard bold font"
DESCRIPTION = "This font contains all digits and latin letters uppercase and \
lowercase for the Computer Modern font family in blackboard \
bold."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56414"

RPM_NAME = "texlive-cmathbb-2023.209.1.0svn56414-54.1.noarch.rpm"
RPM_HASH = "ff2a652f55c2e92657e443372dae995180944eba647bcad50a6fa197d32f51b7649693f1c173b361b434c535d7881753c3144b3ec3701af8a989d3085eabec2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a-ghauqe.enc \
tex-a-jggq4p.enc \
tex-a-ns6ls2.enc \
tex-a-szuv3s.enc \
tex-cmathbb-Regular-tlf-ly1--base.tfm \
tex-cmathbb-Regular-tlf-ly1--lcdfj.tfm \
tex-cmathbb-Regular-tlf-ly1.tfm \
tex-cmathbb-Regular-tlf-ly1.vf \
tex-cmathbb-Regular-tlf-ot1--base.tfm \
tex-cmathbb-Regular-tlf-ot1--lcdfj.tfm \
tex-cmathbb-Regular-tlf-ot1.tfm \
tex-cmathbb-Regular-tlf-ot1.vf \
tex-cmathbb-Regular-tlf-t1--base.tfm \
tex-cmathbb-Regular-tlf-t1--lcdfj.tfm \
tex-cmathbb-Regular-tlf-t1.tfm \
tex-cmathbb-Regular-tlf-t1.vf \
tex-cmathbb-Regular-tlf-ts1--base.tfm \
tex-cmathbb-Regular-tlf-ts1.tfm \
tex-cmathbb-Regular-tlf-ts1.vf \
tex-cmathbb.map \
tex-cmathbb.sty \
tex-ucmath.fd \
texlive-cmathbb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-updmap.cfg \
texlive \
texlive-cmathbb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
