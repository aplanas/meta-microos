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

PV = "2023.209.1.5isvn15878"

RPM_NAME = "texlive-akletter-2023.209.1.5isvn15878-55.1.noarch.rpm"
RPM_HASH = "12be5dbb3496431c90189d47e856f2e9a4190631c29e62727b9a690f5b15e49055e5bf2bc56ab97ce2ff0252d341754de9679f5bf1c607d4abf0df2d459e7d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-akfax.cfg \
tex-akletter.cfg \
tex-akletter.cls \
tex-myletter.cls \
texlive-akletter"

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
