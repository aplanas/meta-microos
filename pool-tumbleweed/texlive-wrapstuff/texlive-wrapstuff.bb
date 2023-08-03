SUMMARY = "Wrapping text around stuff"
DESCRIPTION = "This package provides another implementation of text wrapping. \
Its implementation benefits from the paragraph hooks available \
since LaTeX 2021-06-01."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-2023.209.0.0.3svn64058-53.1.noarch.rpm"
RPM_HASH = "43a7d8f991aef36ead482270b6cab84959c7bc69e274be5107e6df74215e6da52ea636a5b42bb513bc47ed01a4251001be1f8ad40457a9065374fb5801fd4e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapstuff.sty \
texlive-wrapstuff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
