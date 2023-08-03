SUMMARY = "A fancy Curriculum Vitae class"
DESCRIPTION = "The class provides an environment for creating a fancily laid \
out tabular curriculum vitae inspired by the european \
curriculum vitae. The distribution comes with a German and an \
English template."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn24928"

RPM_NAME = "texlive-ecv-2023.209.0.0.3svn24928-54.1.noarch.rpm"
RPM_HASH = "9af82f956d6292ab1f2992e8f8f61fbf208773b2ab1c3faa62749aafab869d4e2e52ec2df28221b56a01a5ee4b2c9f682d841e0599f0945c64d853c7e9cc0648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecv.cls \
tex-ecvEnglish.ldf \
tex-ecvGerman.ldf \
tex-ecvNLS.sty \
texlive-ecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-longtable.sty \
tex-paralist.sty \
tex-pgf.sty \
tex-selinput.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
