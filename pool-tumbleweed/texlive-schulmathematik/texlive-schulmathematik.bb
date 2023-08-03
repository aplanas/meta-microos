SUMMARY = "Commands and document classes for German-speaking teachers of mathematics and physics"
DESCRIPTION = "The schulmathematik bundle provides two LaTeX packages and six \
document classes for German-speaking teachers of mathematics \
and physics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn64108"

RPM_NAME = "texlive-schulmathematik-2023.209.1.3svn64108-54.1.noarch.rpm"
RPM_HASH = "ac373a2020d5b281bc38bccc0f87bbc13877f3a52fb43fc586a973343133303db6d26b9e33bce098d28163235dfcede9f00e5be8311c0667278918f63d9fc707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schulma-ab.cls \
tex-schulma-gutachten.cls \
tex-schulma-klausur.cls \
tex-schulma-komp.cls \
tex-schulma-mdlprf.cls \
tex-schulma-physik.sty \
tex-schulma-praes.cls \
tex-schulma.sty \
texlive-schulmathematik"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-autoaligne.sty \
tex-babel.sty \
tex-beamerarticle.sty \
tex-comment.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-icomma.sty \
tex-isodate.sty \
tex-mathtools.sty \
tex-pgfpages.sty \
tex-pgfplots.sty \
tex-scrlayer-scrpage.sty \
tex-siunitx.sty \
tex-tasks.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
