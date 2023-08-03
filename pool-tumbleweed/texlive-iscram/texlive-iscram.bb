SUMMARY = "A LaTeX class to publish article to ISCRAM conferences"
DESCRIPTION = "LaTeX class to publish article to ISCRAM (International \
Conference on Information Systems for Crisis Response and \
Management)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn45801"

RPM_NAME = "texlive-iscram-2023.209.1.1svn45801-56.1.noarch.rpm"
RPM_HASH = "a68dc8f2f86252ca89744ab5e590271bc046714c69565d4d95ad3af6b51641dde09762ced9c642ac8498e9a6bcbc0ac02c3f5e42c1fbc2b68b06c1fc8e9a4dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iscram.cls \
texlive-iscram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-nowidow.sty \
tex-pgfopts.sty \
tex-titlesec.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
