SUMMARY = "Support for Albanian within babel"
DESCRIPTION = "The package provides support for typesetting Albanian (as part \
of the babel system)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0dsvn57005"

RPM_NAME = "texlive-babel-albanian-2023.209.1.0dsvn57005-54.1.noarch.rpm"
RPM_HASH = "25535e8ba13e9d2592f11b44305659635d3516fda8da59bc37e318ed97e1f8dea1792939a0412af17c3753f46d9ae1c368f4b3c4fdf573111a864decd6ae2741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-albanian.ldf \
texlive-babel-albanian"

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
