SUMMARY = "Development pre-release of the LaTeX graphics bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX graphics \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.209.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-graphics-dev-2023.209.20230501_pre_release_0svn64899-56.1.noarch.rpm"
RPM_HASH = "1fe5b95ee5952ea8266c47fdd739b6bf899a9c76afb9c96c001926d85a9d2c24cb0eacbfec5db5efb5848221581b478f26f4c5792394e3dd8c2af94072cbf075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-color.sty \
texdev-dvipdf.def \
texdev-dvipsnam.def \
texdev-dvipsone.def \
texdev-dviwin.def \
texdev-emtex.def \
texdev-epsfig.sty \
texdev-graphics-2017-06-25.sty \
texdev-graphics.sty \
texdev-graphicx.sty \
texdev-keyval.sty \
texdev-lscape.sty \
texdev-pctex32.def \
texdev-pctexhp.def \
texdev-pctexps.def \
texdev-pctexwin.def \
texdev-rotating.sty \
texdev-tcidvi.def \
texdev-trig.sty \
texdev-truetex.def \
texlive-latex-graphics-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texdev-ifthen.sty \
texlive \
texlive-filesystem \
texlive-graphics-cfg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
