SUMMARY = "String manipulation for (La)TeX"
DESCRIPTION = "The package provides macros for manipulating strings -- testing \
a string's contents, extracting substrings, substitution of \
substrings and providing numbers such as string length, \
position of, or number of recurrences of, a substring. The \
package works equally in Plain TeX and LaTeX (though e-TeX is \
always required). The strings to be processed may contain \
(expandable) macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.85svn65551"

RPM_NAME = "texlive-xstring-2023.209.1.85svn65551-53.2.noarch.rpm"
RPM_HASH = "c0a55eeb9e0841644222584c0ee5f1ba76106c22852209f74bbcba572336f6f396fc5a7755e5feca4acfebe38c2aee1a1cd2447e5b2b9477722dd9c1aa38a12a"
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
