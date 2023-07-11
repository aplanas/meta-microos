SUMMARY = "Support for LY1 LaTeX encoding"
DESCRIPTION = "The Y&Y 'texnansi' (TeX and ANSI, for Microsoft interpretations \
of ANSI standards) encoding lives on, even after the decease of \
the company; it is known in the LaTeX scheme of things as LY1 \
encoding. This bundle includes metrics and LaTeX macros to use \
the basic three (Times, Helvetica and Courier) Adobe Type 1 \
fonts in LaTeX using LY1 encoding."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63565"

RPM_NAME = "texlive-ly1-2023.208.svn63565-53.1.noarch.rpm"
RPM_HASH = "6dfdb6ae4a7365ec0f15667516402e9888a4143b7a35fcf74c95ac4a811d8954f1769a7f95a2c51d5b00560d202df1ba24dd27e7e2761483c7ff685163053c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ly1enc.def \
tex-ly1pag.fd \
tex-ly1pbk.fd \
tex-ly1pcr.fd \
tex-ly1phv.fd \
tex-ly1pnc.fd \
tex-ly1ppl.fd \
tex-ly1ptm.fd \
tex-ly1pzc.fd \
tex-pag8y.map \
tex-pagd8y.tfm \
tex-pagdo8y.tfm \
tex-pagk8y.tfm \
tex-pagko8y.tfm \
tex-pbk8y.map \
tex-pbkd8y.tfm \
tex-pbkdi8y.tfm \
tex-pbkdo8y.tfm \
tex-pbkl8y.tfm \
tex-pbkli8y.tfm \
tex-pbklo8y.tfm \
tex-pcr8y.map \
tex-pcrb8y.tfm \
tex-pcrbo8y.tfm \
tex-pcrr8y.tfm \
tex-pcrro8y.tfm \
tex-phv8y.map \
tex-phvb8y.tfm \
tex-phvb8yn.tfm \
tex-phvbo8y.tfm \
tex-phvbo8yn.tfm \
tex-phvr8y.tfm \
tex-phvr8yn.tfm \
tex-phvro8y.tfm \
tex-phvro8yn.tfm \
tex-pnc8y.map \
tex-pncb8y.tfm \
tex-pncbi8y.tfm \
tex-pncbo8y.tfm \
tex-pncr8y.tfm \
tex-pncri8y.tfm \
tex-pncro8y.tfm \
tex-ppl8y.map \
tex-pplb8y.tfm \
tex-pplbi8y.tfm \
tex-pplbo8y.tfm \
tex-pplbu8y.tfm \
tex-pplr8y.tfm \
tex-pplr8yn.tfm \
tex-pplri8y.tfm \
tex-pplro8y.tfm \
tex-pplrr8ye.tfm \
tex-pplru8y.tfm \
tex-ptm8y.map \
tex-ptmb8y.tfm \
tex-ptmbc8y.tfm \
tex-ptmbc8y.vf \
tex-ptmbi8y.tfm \
tex-ptmbo8y.tfm \
tex-ptmr8y.tfm \
tex-ptmr8yn.tfm \
tex-ptmrc8y.tfm \
tex-ptmrc8y.vf \
tex-ptmri8y.tfm \
tex-ptmro8y.tfm \
tex-ptmrr8ye.tfm \
tex-pzc8y.map \
tex-pzcmi8y.tfm \
tex-texnansi.enc \
tex-texnansi.sty \
tex-texnansi.tex \
texlive-ly1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
