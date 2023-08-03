SUMMARY = "Clever LaTeX cross-references based on zref"
DESCRIPTION = "This package provides a user interface for making LaTeX \
cross-references which automates some of their typical \
features, thus easing their input in the document and improving \
the consistency of typeset results. A reference made with \
\\zcref includes a 'name' according to its 'type', and lists of \
multiple labels can be automatically sorted and compressed into \
ranges when due. The reference format is highly and easily \
customizable, both globally and locally. The package is based \
on zref's extensible referencing system."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-2023.209.0.0.3.6svn66021-53.1.noarch.rpm"
RPM_HASH = "20eb9c2d125fffc32f9b3ec91f67e7bb0e3f09c3cdceb4cfc1a6a3e5fb099c8a8e2c08c56b285c7699a686a95d9e8eeb1ab8f486764f557580e3446a47f60afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-clever.sty \
texlive-zref-clever"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifdraft.sty \
tex-zref-abspage.sty \
tex-zref-base.sty \
tex-zref-hyperref.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
