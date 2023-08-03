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

RPM_NAME = "texlive-xkeyval-2023.209.2.9svn63616-53.1.noarch.rpm"
RPM_HASH = "246be0b3cf78c5cdacbfdf7533c85390142cc77e6f0b02e6ec963dbc2a7bfd0cf3ea531e5e72bbeea69106f97862787dfca2395ccb80d3dfab4e59605655cb6a"
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
