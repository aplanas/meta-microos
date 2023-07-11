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

PV = "2023.201.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-2023.201.0.0.3.6svn66021-52.2.noarch.rpm"
RPM_HASH = "18142ed3dc9150e6faa1db351eff61bf9feedb5cf28e41f9f7e77ec4fd1cfe5e7a956162ba50684195c1f02f899f13dd0eff8bd5e9f80161b40f7bc4049aac6a"
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
