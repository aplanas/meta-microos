SUMMARY = "Watching TeX digest tokens"
DESCRIPTION = "The aim of this LaTeX package is to help debug complicated \
macros. This is done by letting the user step through the \
execution of some TeX code, going through the details of nested \
expansions, performing assignments, as well as some simple \
typesetting commands. To use this package, one should normally \
run TeX in a terminal. The unravel package requires up-to-date \
versions of the l3kernel, l3packages and l3experimental \
bundles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn59175"

RPM_NAME = "texlive-unravel-2023.209.0.0.3asvn59175-54.1.noarch.rpm"
RPM_HASH = "b4b875e13c586bd3a509115b2a2614ce6d876e39de1dbfd2a97e9974c675d91fae1d5cdf52fd450c07ccd9a87abbbc34f336fed0acd642338a47630a0c61766b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unravel.sty \
texlive-unravel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-gtl.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
