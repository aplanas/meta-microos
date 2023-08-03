SUMMARY = "A LaTeX package for maintaining multiple translations of a document"
DESCRIPTION = "Maintaining a LaTeX document with translations for multiple \
languages can be cumbersome and error-prone. This package \
provides a set of macros for defining macros and environments \
as wrappers around existing macros and environments. These \
wrappers allow one to clearly specify multiple translations for \
the arguments to the wrapped macros and environments while only \
the translation of the document's language is actually shown. \
Choosing a translation then is as simple as choosing the \
document's language via babel or polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9bsvn49065"

RPM_NAME = "texlive-multilang-2023.209.0.0.9bsvn49065-55.1.noarch.rpm"
RPM_HASH = "41d17742e3182a746c37a34664cd389007ce47f454da2bc362beadd744a125ce8e7cfa915f8cc84085c486537577aed7ddb9e21c8b445c973705f52ca4a73dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multilang-sect.sty \
tex-multilang-tags.sty \
tex-multilang.sty \
texlive-multilang"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
