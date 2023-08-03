SUMMARY = "Use cprotect arbitrarily nested"
DESCRIPTION = "This package extends the cprotect package to allow users to use \
verbatim-like commands inside arbitrary parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63833"

RPM_NAME = "texlive-cprotectinside-2023.209.0.0.0.0svn63833-55.1.noarch.rpm"
RPM_HASH = "b94f4b14d37addf5a766a7ab6a06bca95b067f49de00e31620dcc00d7621e87f33a90a7708dd46c0bda2ae981852a145908c471436335a9271d090ffe4fb0be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cprotectinside.sty \
texlive-cprotectinside"

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
