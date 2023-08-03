SUMMARY = "T1-encoded versions of Haralambous old German fonts"
DESCRIPTION = "This package contains virtual fonts that offer T1-alike encoded \
variants of Yannis Haralambous's old German fonts Gothic, \
Schwabacher and Fraktur (which are also available in Adobe type \
1 format). The package includes LaTeX macros to embed the fonts \
into the LaTeX font selection scheme."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-blacklettert1-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "ee881e60c324f1d4adfd935fe75963a17547e2a07ffa939a9db69ea1be4d36e875e8438840bf417d5144f2166a3a6950dbfff5e81917187af17805f9c5fc7126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t1yfrak.fd \
tex-tfrak.tfm \
tex-tfrak.vf \
tex-tfrakls.tfm \
tex-tfrakls.vf \
tex-tgoth.tfm \
tex-tgoth.vf \
tex-tswab.tfm \
tex-tswab.vf \
texlive-blacklettert1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbsy10.tfm \
tex-cmbx10.tfm \
tex-cmmi10.tfm \
tex-cmmib10.tfm \
tex-cmr10.tfm \
tex-cmr7.tfm \
tex-cmsy10.tfm \
tex-cmu10.tfm \
tex-ecbx1000.tfm \
tex-ecrm0700.tfm \
tex-ecrm1000.tfm \
tex-yfrak.tfm \
tex-ygoth.tfm \
tex-yswab.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
