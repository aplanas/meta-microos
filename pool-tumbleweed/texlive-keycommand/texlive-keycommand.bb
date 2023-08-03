SUMMARY = "Simple creation of commands with key-value arguments"
DESCRIPTION = "The package (which requires e-TeX) provides a natural way to \
define commands with optional keys. The package provides \
\\newkeycommand, \\renewkeycommand, \\providekeycommand, \
\\newkeyenvironment and \\renewkeyenvironment, together with \
\\keycmd for a more advanced interface. The package is based on \
kvsetkeys by Heiko Oberdiek."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415svn18042"

RPM_NAME = "texlive-keycommand-2023.209.3.1415svn18042-56.1.noarch.rpm"
RPM_HASH = "daaeedede16ba7e87e70e0f61adc00be473a4d5d868a3f319f8e17d7829883189b486f159179e05b252fd6d146022f524de9fb70a4dd5069fb7cd6a1cff12f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keycommand.sty \
texlive-keycommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-kvsetkeys.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
