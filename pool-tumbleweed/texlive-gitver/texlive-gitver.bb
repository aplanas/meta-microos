SUMMARY = "Get the current git hash of a project and typeset it in the document"
DESCRIPTION = "This package will get a description of the current git version \
of the document and store it in a command \\gitVer. If memoir or \
fancyhdr are in use, it will also add this to the document \
footers unless the option 'noheader' is passed. The package \
also defines a command \\versionBox which outputs a box \
containing the version and date of compilation. The package \
requires hyperref, catchfile, pdftexcmds, and datetime."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63920"

RPM_NAME = "texlive-gitver-2023.209.1.4svn63920-54.2.noarch.rpm"
RPM_HASH = "f5516a8c747af71004eabdd54a0f415c22b02b4d5376722ceae3c43b09cdc03aab1d526fd2261bec4bf82eae7ce770d002b35427c93def0c00a674f260d888d9"
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
