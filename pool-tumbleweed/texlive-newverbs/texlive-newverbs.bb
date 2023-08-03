SUMMARY = "Define new versions of \\verb, including short verb versions"
DESCRIPTION = "The package allows the definition of \\verb variants which add \
TeX code before and after the verbatim text (e.g., quotes or \
surrounding \\fbox{}). When used together with the shortvrb \
package it allows the definition of short verbatim characters \
which use this package's variant instead of the normal \\verb. \
In addition, it is possible to collect an argument verbatim to \
either typeset or write it into a file. The \\Verbdef command \
defines verbatim text to a macro which can later be used to \
write the verbatim text to a file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6asvn64833"

RPM_NAME = "texlive-newverbs-2023.209.1.6asvn64833-55.1.noarch.rpm"
RPM_HASH = "f9ae335acb5d0915ebdc4d32d5923f159b034a1eb85c6192ed86cc65533762520a107f4f7cfc15db6c0cb657585be5e387805e4a7eb3d033347b903c53c6ffd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newverbs.sty \
texlive-newverbs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-shortvrb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
