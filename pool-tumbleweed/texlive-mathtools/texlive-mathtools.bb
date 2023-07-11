SUMMARY = "Mathematical tools to use with amsmath"
DESCRIPTION = "Mathtools provides a series of packages designed to enhance the \
appearance of documents containing a lot of mathematics. The \
main backbone is amsmath, so those unfamiliar with this \
required part of the LaTeX system will probably not find the \
packages very useful. Mathtools provides many useful tools for \
mathematical typesetting. It is based on amsmath and fixes \
various deficiencies of amsmath and standard LaTeX. It \
provides Extensible symbols, such as brackets, arrows, \
harpoons, etc.; Various symbols such as \\coloneqq (:=); Easy \
creation of new tag forms; Showing equation numbers only for \
referenced equations; Extensible arrows, harpoons and \
hookarrows; Starred versions of the amsmath matrix environments \
for specifying the column alignment; More building blocks: \
multlined, cases-like environments, new gathered environments; \
Maths versions of \\makebox, \\llap, \\rlap etc.; Cramped math \
styles; and more... Mathtools requires mhsetup."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.29svn63767"

RPM_NAME = "texlive-mathtools-2023.208.1.29svn63767-53.1.noarch.rpm"
RPM_HASH = "80d0c72d99960a52982858390b0168f6f4fc4b5c009652431e0168b63497f2f78c7eaf972b711db9813fdebd02aac446103458140763ab69be3845bb0cfda1c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-empheq.sty \
tex-mathtools.sty \
tex-mhsetup.sty \
texlive-mathtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
