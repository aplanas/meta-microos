SUMMARY = "Write numbers as cyrillic glyphs"
DESCRIPTION = "The package extends ConTeXt's system of number conversion, by \
adding numeration using cyrillic letters."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-cyrillicnumbers-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "bdceb5fd3d55bd25fbfdac7bc5f25b83451552db6ed4af2edab6311988d218d83d103197c783d122b821df95e1d54e27abd280c4266ce026713ebc5aa56cff7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cyrillicnumbers"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
