SUMMARY = "Babel support for typesetting Slovenian"
DESCRIPTION = "The package provides the language definition file for support \
of Slovenian in babel. Several shortcuts are defined, as well \
as translations to Slovenian of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2nsvn57666"

RPM_NAME = "texlive-babel-slovenian-2023.209.1.2nsvn57666-54.1.noarch.rpm"
RPM_HASH = "1eae06baf3be30ed64df995aee6f8e39f06a3bf480c752f6a0dd799fcff657781eb2dbf61654dde63ed4948136bb528586be74a4bf56beef22578ee96f7912b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slovene.ldf \
texlive-babel-slovenian"

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
