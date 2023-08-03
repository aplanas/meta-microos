SUMMARY = "A class for submissions to the proceedings of conferences on JACoW.org"
DESCRIPTION = "The jacow class is used for submissions to the proceedings of \
conferences on Joint Accelerator Conferences Website (JACoW), \
an international collaboration that publishes the proceedings \
of accelerator conferences held around the world."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn63060"

RPM_NAME = "texlive-jacow-2023.209.2.7svn63060-56.1.noarch.rpm"
RPM_HASH = "e40608be8c1e5304ea396d04f41cd790b194c24f0699b822ab97e47ef56528c3f008ea16bf66db6997b638715611cacec3e86ea52b6ad11f912e777752beb364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jacow.cls \
texlive-jacow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-biblatex.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cite.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fix-cm.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtt.sty \
tex-siunitx.sty \
tex-textcase.sty \
tex-textcomp.sty \
tex-tgtermes.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
