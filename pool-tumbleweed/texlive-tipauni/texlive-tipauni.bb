SUMMARY = "Producing Unicode characters with TIPA commands"
DESCRIPTION = "Package TIPA uses the T3 encoding for producing IPA characters. \
The package is widely used in the field of linguistics, but \
because of the old encoding, the output documents are less \
productive than Unicode-based documents. This package redefines \
most of the TIPA-commands for outputting Unicode characters. \
Users can now use their beloved TIPA shortcuts with the \
benefits of Unicode, i.e. searchability, copy-pasting, changing \
the font and many more. As this package needs the fontspec \
package for loading an IPA font, it needs to be compiled with \
XeLaTeX or LuaLaTeX. This package can also be viewed as an \
ASCII-based input method for producing IPA characters in \
Unicode. It needs the New Computer Modern font for printing IPA \
characters."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7asvn65817"

RPM_NAME = "texlive-tipauni-2023.209.0.0.7asvn65817-53.1.noarch.rpm"
RPM_HASH = "52f1cdf9e391dd5716dfa4c4e6d66e0fbdccf5bae905c0d0f841c54bbbe88afd074612331a3514b971dc48685ee80a27660c7ee2547c25a9da4378a12e9d7d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tipauni.sty \
texlive-tipauni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv-def.sty \
tex-expkv-opt.sty \
tex-fontspec.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
