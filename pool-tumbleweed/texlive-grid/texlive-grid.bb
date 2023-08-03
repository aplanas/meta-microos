SUMMARY = "Grid typesetting in LaTeX"
DESCRIPTION = "The package helps to enables grid typesetting in double column \
documents. Grid typesetting (vertical aligning of lines of text \
in adjacent columns) is a difficult task in LaTeX, and the \
present package is no more than an attempt to help users to \
achieve it in a limited way. An example document, grid.tex, is \
provided with simple instructions to typeset it using the \
package. The package needs a lot more work: this is only a \
beginning..."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-grid-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "c535c77b844f8133522b6166e6c496bbaa72381996a77e9aa724c05ff56f0985c04bc47376034f7d769d16d18a4147b60fffbfd941be1877aac852f1c9c6eed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid.sty \
texlive-grid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
