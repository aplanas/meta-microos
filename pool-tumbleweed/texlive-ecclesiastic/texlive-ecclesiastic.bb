SUMMARY = "Typesetting Ecclesiastic Latin"
DESCRIPTION = "The package modifies the way the latin option to babel operates \
when typesetting Latin. The style is somewhat 'frenchified' in \
respect of punctuation spacings and footnote style; shortcuts \
are available in order to set accents on all vowels, including \
y and the diphthongs ae and oe."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-2023.209.0.0.3svn38172-54.1.noarch.rpm"
RPM_HASH = "74700ce4f5d69530a079262787c0bf30df8517bcd28cbd0d1c878173f2af70ecc1d7a2f4bc529a88733b4cfda7ff57b5508adf636637a969a701c132ba007cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecclesiastic.sty \
texlive-ecclesiastic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
