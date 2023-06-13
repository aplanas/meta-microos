SUMMARY = "Comprehensive letter support"
DESCRIPTION = "An advanced letter document class which extends LaTeX's usual \
letter class, providing support for building your own \
letterhead and marking fold points for window envelopes. \
Options supported by the package include: letterpaper for US \
letter; a4offset for a modified A4 layout suitable for platic \
binders that cover a part of the left margin. The class's \
handling of dates has inspired an extended version of \
date-handling in the isodate package. The class supersedes an \
earlier class called myletter."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5isvn15878"

RPM_NAME = "texlive-akletter-2023.201.1.5isvn15878-54.1.noarch.rpm"
RPM_HASH = "944e29bd8bdce21c7c1f281e60eebe50dbd4b89e0480d85b213081dd7b1ec30667faa885fe42b824877acb6e53911c0e0151b4439fd57bcf85f81970b012bec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(akfax.cfg) \
tex(akletter.cfg) \
tex(akletter.cls) \
tex(myletter.cls) \
texlive-akletter"

RDEPENDS:${PN} += "/bin/sh \
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
