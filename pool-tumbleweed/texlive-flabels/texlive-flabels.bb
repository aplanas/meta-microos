SUMMARY = "Labels for files and folders"
DESCRIPTION = "Macros for typesetting pretty labels (optionally colored) for \
the back of files or binders (currently only the special A4 \
'Leitz-Ordner' ring binder is supported)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17272"

RPM_NAME = "texlive-flabels-2023.209.1.0svn17272-53.1.noarch.rpm"
RPM_HASH = "937a526be5b6484949fb19b278719e84ce23b19264e8a6a35188e43f856ee1456b05ecaaf54d5a3684ed4f4afde57b969422285071f778fd63d5aa9fca0291f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flabels.sty \
texlive-flabels"

RDEPENDS:${PN} += "/usr/bin/sh \
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
