SUMMARY = "Write Metanorma standardization documents using LaTe"
DESCRIPTION = "metanorma This work includes a LaTeX document class, a \
`latexml` script and a `latexmlpost` stylesheet which allow you \
to write a LaTeX document and transcode it into Metanorma's \
`ADOC` format. This work is sponsored by Ribose Inc. \
(<https://www.ribose.com>). This work is maintained by Ribose \
Inc. (<open.source@ribose.com>)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.0svn55010"

RPM_NAME = "texlive-metanorma-2023.209.0.0.5.0svn55010-55.1.noarch.rpm"
RPM_HASH = "8ec3e0978f722222e3d8c33c1fc977dda928bfa3c9fb370f49b8efa61fc350499c0f8208965eb069b0b1605a77f783ed3cf49c708edf0f334d7b730f360f51e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metanorma.cls \
texlive-metanorma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-enumitem.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-mdframed.sty \
tex-subcaption.sty \
tex-ulem.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
