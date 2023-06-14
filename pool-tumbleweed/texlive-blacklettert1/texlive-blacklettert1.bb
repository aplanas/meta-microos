SUMMARY = "T1-encoded versions of Haralambous old German fonts"
DESCRIPTION = "This package contains virtual fonts that offer T1-alike encoded \
variants of Yannis Haralambous's old German fonts Gothic, \
Schwabacher and Fraktur (which are also available in Adobe type \
1 format). The package includes LaTeX macros to embed the fonts \
into the LaTeX font selection scheme."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-blacklettert1-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "eb48e4a034ce712995ba212224b214dc80ad38b21ca1e91578012d8f4bfaaef58c3c6e2315de092caf083ac098b37c2b5ca4034e082a815a67c4d8162d0c85b3"
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

RDEPENDS:${PN} += "/bin/sh \
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
