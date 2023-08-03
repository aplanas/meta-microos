SUMMARY = "Babel support for English"
DESCRIPTION = "The package provides the language definition file for support \
of English in babel. Care is taken to select british \
hyphenation patterns for British English and Australian text, \
and default ('american') patterns for Canadian and USA text."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3rsvn44495"

RPM_NAME = "texlive-babel-english-2023.209.3.3rsvn44495-54.1.noarch.rpm"
RPM_HASH = "206805006dbc7349d44e0befdd9e0af0ad3d84a6533e92a00ce933b6242d06c9ba8086d4562313f5aaf74ff95de8bbcd28530373e2d69c9c72783877db5536f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UKenglish.ldf \
tex-USenglish.ldf \
tex-american.ldf \
tex-australian.ldf \
tex-british.ldf \
tex-canadian.ldf \
tex-english.ldf \
tex-newzealand.ldf \
texlive-babel-english"

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
