SUMMARY = "Kerning between words and against space"
DESCRIPTION = "This package provides two shorthands for typesetting breaking \
and non-breaking small spaces, where both hyphenation and \
kerning against space are correctly applied. Additionally, \
interword kerning can be applied."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn63552"

RPM_NAME = "texlive-spacekern-2023.209.0.0.1asvn63552-58.1.noarch.rpm"
RPM_HASH = "756d91a3a15805ce56749d1d8687f5597f7b091004693ef27c1a414ebeee7542cecf24b0b2b0411878b9f06ecac18304a7942c48995a5477d50a470132c0ba52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spacekern.sty \
texlive-spacekern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
