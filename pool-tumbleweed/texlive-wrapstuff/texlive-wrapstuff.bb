SUMMARY = "Wrapping text around stuff"
DESCRIPTION = "This package provides another implementation of text wrapping. \
Its implementation benefits from the paragraph hooks available \
since LaTeX 2021-06-01."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-2023.201.0.0.3svn64058-52.2.noarch.rpm"
RPM_HASH = "9aa94ed3fa8898bb3ce1810beb7a08622b99482b073977678a8b28d96cc81f9b8574be8e7e0d1d0ed77d10d60397f9a49de3b545d7052d03a352a361ba48c9ab"
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
