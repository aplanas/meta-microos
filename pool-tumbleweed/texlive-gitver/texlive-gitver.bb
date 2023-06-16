SUMMARY = "Get the current git hash of a project and typeset it in the document"
DESCRIPTION = "This package will get a description of the current git version \
of the document and store it in a command \\gitVer. If memoir or \
fancyhdr are in use, it will also add this to the document \
footers unless the option 'noheader' is passed. The package \
also defines a command \\versionBox which outputs a box \
containing the version and date of compilation. The package \
requires hyperref, catchfile, pdftexcmds, and datetime."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63920"

RPM_NAME = "texlive-gitver-2023.201.1.4svn63920-53.1.noarch.rpm"
RPM_HASH = "4f844bf5aee5b4f6fb0bb8f0d5abd7f8f0c1eadcd902a4eea0bd21edccad572b97cfcb48c636fdaa4cc7a6e8061f772f8fbf37c10f89aecd011df4beec3288ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitver.sty \
texlive-gitver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-datetime2.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-pdftexcmds.sty \
tex-shellesc.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
