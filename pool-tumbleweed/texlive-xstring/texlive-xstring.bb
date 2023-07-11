SUMMARY = "String manipulation for (La)TeX"
DESCRIPTION = "The package provides macros for manipulating strings -- testing \
a string's contents, extracting substrings, substitution of \
substrings and providing numbers such as string length, \
position of, or number of recurrences of, a substring. The \
package works equally in Plain TeX and LaTeX (though e-TeX is \
always required). The strings to be processed may contain \
(expandable) macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.85svn65551"

RPM_NAME = "texlive-xstring-2023.201.1.85svn65551-52.2.noarch.rpm"
RPM_HASH = "c2d15d6d7474d4a6954e6a558333f796c6d2f22f4ce6a703982f9933535d4346b900f6da8ed3cdd5ac7a56e2b9cba66ae1e33c7558dd9589047fba8452052e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xstring.sty \
tex-xstring.tex \
texlive-xstring"

RDEPENDS:${PN} += "/usr/bin/sh \
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
