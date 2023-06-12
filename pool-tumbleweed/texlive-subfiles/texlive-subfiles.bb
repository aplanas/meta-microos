SUMMARY = "Individual typesetting of subfiles of a 'main' document"
DESCRIPTION = "Using this package the user can handle multi-file projects more \
comfortably, making it possible to both process the subsidiary \
files by themselves and to process the main file that includes \
them, without making any changes to either."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn56977"

RPM_NAME = "texlive-subfiles-2023.201.2.2svn56977-57.1.noarch.rpm"
RPM_HASH = "f83a638a1ffa30a948dd128de62e7332a4953081df7d3fba961f13761fae3c0b8f4dfb3b76defe7ed40c55a90ae3916a0c953d16e0eca13813c6995623eadc8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subfiles.cls) \
tex(subfiles.sty) \
texlive-subfiles"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(import.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-import \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
