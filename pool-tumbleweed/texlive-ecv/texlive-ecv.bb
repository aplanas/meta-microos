SUMMARY = "A fancy Curriculum Vitae class"
DESCRIPTION = "The class provides an environment for creating a fancily laid \
out tabular curriculum vitae inspired by the european \
curriculum vitae. The distribution comes with a German and an \
English template."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn24928"

RPM_NAME = "texlive-ecv-2023.209.0.0.3svn24928-54.2.noarch.rpm"
RPM_HASH = "8aa47aca660890dc8cb09b09efbafde7081ec9e056a1f014fd1cafe5bf12ee278cb29b25e8776228e040472142382c76abbc6b5840a6b50ddcef846bde84294d"
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
