SUMMARY = "Left sub- and superscripts in maths mode"
DESCRIPTION = "The package enables left subscripts and superscripts in maths \
mode. The sub- and superscripts are raised for optimum fitting \
to the symbol indexed, in such a way that left and right sub- \
and superscripts are set on the same level, as appropriate. The \
package provides an alternative to the use of the \\sideset \
command in the amsmath package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn32214"

RPM_NAME = "texlive-fouridx-2023.201.2.00svn32214-52.1.noarch.rpm"
RPM_HASH = "f442b759a6f3adf62e6e4fa97c5564cbbfdd9705771d44cc2eb9ae45712e2a0c9d6df608be76eba4a103ea1ed068c5217933193366556767e58bae2b49f1d95a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fouridx.sty) \
texlive-fouridx"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
