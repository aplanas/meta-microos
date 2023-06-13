SUMMARY = "Allow hyphenation of partially-emphasised substrings"
DESCRIPTION = "The package fixes the problem of TeX failing to hyphenate \
letter strings that seem (to TeX) to be words, but which are \
followed by an apostrophe and then an emphasis command. The \
cause of the problem is not the apostrophe, but the font change \
in the middle of the string. The problem arises in Catalan, \
French, Italian and Romansh."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn25832"

RPM_NAME = "texlive-fixltxhyph-2023.201.0.0.4svn25832-52.1.noarch.rpm"
RPM_HASH = "d07a267645e9cccb43342a970f8f44b3d417c7916f89b2842396c5f6cf2e72397e3b76efac2669191176d712cfbc37109aea6476d2655338948c203fd21a13f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixltxhyph.sty) \
texlive-fixltxhyph"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
