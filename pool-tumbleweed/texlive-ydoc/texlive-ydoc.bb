SUMMARY = "Macros for documentation of LaTeX classes and packages"
DESCRIPTION = "The package provides macros and environments to document LaTeX \
packages and classes. It is an (as yet unfinished) alternative \
to the ltxdoc class and the doc or xdoc packages. The aim is to \
provide a different layout and more modern styles (using the \
xcolor, hyperref packages, etc.) This is an alpha release, and \
should probably not (yet) be used with other packages, since \
the implementation might change. Nevertheless, the author uses \
it to document his own packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-2023.201.0.0.7alphasvn64887-52.2.noarch.rpm"
RPM_HASH = "6a17403f2035622530365947a1cfc0763d1b4fa7ff0b3d9ea16384732f224abf0e5d8c95af9537c259906799b072b11a8e548a5cea5e2e0575eb56803126a0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ydoc-code.sty \
tex-ydoc-desc.sty \
tex-ydoc-doc.sty \
tex-ydoc-expl.sty \
tex-ydoc.cfg \
tex-ydoc.cls \
tex-ydoc.sty \
tex-ydocincl.tex \
tex-ydocstrip.tex \
texlive-ydoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-etoolbox.sty \
tex-float.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-needspace.sty \
tex-newverbs.sty \
tex-shortvrb.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-float \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings \
texlive-needspace \
texlive-newverbs \
texlive-scripts \
texlive-scripts-bin \
texlive-showexpl \
texlive-tools \
texlive-url \
texlive-xcolor"

inherit rpm
