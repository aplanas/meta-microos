SUMMARY = "Labels for files and folders"
DESCRIPTION = "Macros for typesetting pretty labels (optionally colored) for \
the back of files or binders (currently only the special A4 \
'Leitz-Ordner' ring binder is supported)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17272"

RPM_NAME = "texlive-flabels-2023.201.1.0svn17272-52.1.noarch.rpm"
RPM_HASH = "bebcc3f68c3c2ba8e2d50ae0d1ff099aa8b786691e49ba9e3e72b6f49614e4007462c7753c238aa6c9e4efff0cd5882084ee6a5631641d60f97b712226e34e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flabels.sty \
texlive-flabels"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
