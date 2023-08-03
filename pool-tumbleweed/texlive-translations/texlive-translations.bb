SUMMARY = "Internationalisation of LaTeX2e packages"
DESCRIPTION = "This package (once part of the exsheets package), provides a \
framework for providing multilingual features to a LaTeX \
package. The package has its own basic dictionaries for \
English, Brazilian, Catalan, Dutch, French, German and Spanish; \
it aims to use translation material for English, Dutch, French, \
German, Italian, Spanish, Catalan, Turkish, Croatian, \
Hungarian, Danish and Portuguese from babel or polyglossia if \
either is in use in the document. (Additional languages from \
the multilingual packages may be possible: ask the author.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn61896"

RPM_NAME = "texlive-translations-2023.209.1.12svn61896-53.1.noarch.rpm"
RPM_HASH = "f892a9fe66cb94b2c9276e283c631a0f9da6e4d7053829abbae9396f53631a64b2e282f6c7ea4827877f5a28765664b81901f502cc1078fa172fd36044c60557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-translations.sty \
texlive-translations"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
