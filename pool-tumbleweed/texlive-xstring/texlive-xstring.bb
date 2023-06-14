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

RPM_NAME = "texlive-xstring-2023.201.1.85svn65551-52.1.noarch.rpm"
RPM_HASH = "80cfed4ab3166775976da07d8e43458e0524ff2ae9d69945fb8d3601de7ca79b10deeb7ea62ea3e3a58c7a23392ce43ece852db47d8b382911e32a55f24fdf7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xstring.sty \
tex-xstring.tex \
texlive-xstring"

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
