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

PV = "2023.209.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-2023.209.0.0.7alphasvn64887-53.1.noarch.rpm"
RPM_HASH = "557956f664e36795992b7d48e8abc3a72a18a4f82e9f96d2bff86b34f456b42a0b2f58152f8dd68128e8f8ce0761294e87680f54dc184bc157d50288f531bae4"
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
