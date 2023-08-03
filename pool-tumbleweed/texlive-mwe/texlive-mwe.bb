SUMMARY = "Packages and image files for MWEs"
DESCRIPTION = "The bundle provides several files useful when creating a \
minimal working example (MWE). The package itself loads a small \
set of packages often used when creating MWEs. In addition, a \
range of images are provided, which will be installed in the \
TEXMF tree, so that they may be used in any (La)TeX document. \
This allows different users to share MWEs which include image \
commands, without the need to share image files or to use \
replacement code."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64967"

RPM_NAME = "texlive-mwe-2023.209.0.0.5svn64967-55.1.noarch.rpm"
RPM_HASH = "5d617b8652c0aaeeba5336a38bf0c514725ed2b6663c1d26744e111e25cff1d18bfaaf09ef2507524752c47b96dea87fb10340a4ea834ef140bccfed00e39b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-example-grid-100x100bp.tex \
tex-example-grid-100x100pt.tex \
tex-example-image-10x16.tex \
tex-example-image-16x10.tex \
tex-example-image-16x9.tex \
tex-example-image-1x1.tex \
tex-example-image-4x3.tex \
tex-example-image-9x16.tex \
tex-example-image-a.tex \
tex-example-image-a3-landscape.tex \
tex-example-image-a3.tex \
tex-example-image-a4-landscape.tex \
tex-example-image-a4-numbered.tex \
tex-example-image-a4.tex \
tex-example-image-a5-landscape.tex \
tex-example-image-a5.tex \
tex-example-image-b.tex \
tex-example-image-c.tex \
tex-example-image-empty.tex \
tex-example-image-golden-upright.tex \
tex-example-image-golden.tex \
tex-example-image-letter-landscape.tex \
tex-example-image-letter-numbered.tex \
tex-example-image-letter.tex \
tex-example-image-plain.tex \
tex-example-image.tex \
tex-example-movie.tex \
tex-mwe.sty \
texlive-mwe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-blindtext.sty \
tex-graphicx.sty \
tex-lipsum.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
