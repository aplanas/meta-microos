SUMMARY = "Support for the revision control system"
DESCRIPTION = "A package to extract RCS (Revision Control System) information \
and use it in a LaTeX document. For users of LaTeX2HTML \
rcsinfo.perl is included."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-2023.201.1.11svn15878-53.1.noarch.rpm"
RPM_HASH = "cbedc722ba244257f24a2fcba7aa57a63d9ae1aba77fecf0202c68b8808d4bb1e632aca94cc255154d48da957f6fcf0baa1e31fac5e9c6619908abd041799c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rcsinfo.cfg) \
tex(rcsinfo.sty) \
texlive-rcsinfo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancyhdr.sty) \
tex(fancyheadings.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
