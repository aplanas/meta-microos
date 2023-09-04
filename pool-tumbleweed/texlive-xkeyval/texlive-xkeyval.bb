SUMMARY = "Extension of the keyval package"
DESCRIPTION = "This package is an extension of the keyval package and offers \
additional macros for setting keys and declaring and setting \
class or package options. The package allows the programmer to \
specify a prefix to the name of the macros it defines for keys, \
and to define families of key definitions; these all help use \
in documents where several packages define their own sets of \
keys."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn63616"

RPM_NAME = "texlive-xkeyval-2023.209.2.9svn63616-53.2.noarch.rpm"
RPM_HASH = "7a5a9a9b75b809771c5a7545de5d02fb5ce341c4b28d07040e8daad1efe688a42807e8979deef10529776d787a746b4c6d9957c79f01a8d4500164d553c486ba"
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
