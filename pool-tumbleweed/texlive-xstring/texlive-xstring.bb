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

RPM_NAME = "texlive-xstring-2023.209.1.85svn65551-53.1.noarch.rpm"
RPM_HASH = "3f837cc6be846eacc2994f38e89c57e7d000fc0997151df368e3c6b90954c432d2757f5a1eb04a2d53d9eb5a40c6adb5cd8518eb8e9eacae5f6bc6884c2f2a4f"
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
