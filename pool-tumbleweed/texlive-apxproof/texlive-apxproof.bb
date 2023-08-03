SUMMARY = "Proofs in appendix"
DESCRIPTION = "The package makes it easier to write articles where proofs and \
other material are deferred to the appendix. The appendix \
material is written in the LaTeX code along with the main text \
which it naturally complements, and it is automatically \
deferred. The package can automatically send proofs to the \
appendix, can repeat in the appendix the theorem environments \
stated in the main text, can section the appendix automatically \
based on the sectioning of the main text, and supports a \
separate bibliography for the appendix material. It depends on \
the following other packages: amsthm, bibunits (if the \
bibliography option is set to separate), environ, etoolbox, \
fancyvrb, ifthen, and kvoptions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.4svn64715"

RPM_NAME = "texlive-apxproof-2023.209.1.2.4svn64715-55.1.noarch.rpm"
RPM_HASH = "f9f3fa39eeb793a908937605f5b3c3d5a81b79bbfd1fd9efac19d18b4caef047063ce2510626e037c08f39e08256ebdb92bde3f5a6dfdd6f619f900830e1953c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apxproof.sty \
texlive-apxproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-bibunits.sty \
tex-catchfile.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
