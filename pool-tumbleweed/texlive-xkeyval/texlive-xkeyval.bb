SUMMARY = "Extension of the keyval package"
DESCRIPTION = "This package is an extension of the keyval package and offers \
additional macros for setting keys and declaring and setting \
class or package options. The package allows the programmer to \
specify a prefix to the name of the macros it defines for keys, \
and to define families of key definitions; these all help use \
in documents where several packages define their own sets of \
keys."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn63616"

RPM_NAME = "texlive-xkeyval-2023.201.2.9svn63616-52.1.noarch.rpm"
RPM_HASH = "45f271258d7ab04cff2b6cc0a01c61d71f3a1686b5ba6e29b7bcd75aaebf4d5c8820bd802ab7f28389a918fd09e8f53cbca4cabcc76d7b5a305b0703216c579a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyval.tex \
tex-pst-xkey.sty \
tex-pst-xkey.tex \
tex-xkeyval.sty \
tex-xkeyval.tex \
tex-xkvltxp.sty \
tex-xkvtxhdr.tex \
tex-xkvutils.tex \
tex-xkvview.sty \
texlive-xkeyval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
