SUMMARY = "Read and parse text tables"
DESCRIPTION = "This experimental package can read and parse text tables \
delimited by user-defined tokens (e.g., tab). It can be used \
for serial letters and the like, making it easier to export the \
data file from MS-Excel/MS-Word"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16549"

RPM_NAME = "texlive-delimtxt-2023.209.svn16549-53.1.noarch.rpm"
RPM_HASH = "1c2710666c3d6892cfe4251b99cec20de412a1a8cb5818d43abda36c9cb6b0edf560225158717dc234a80484b319fe07069dbf8dbfa48de673f786cae52c1e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimtxt.sty \
texlive-delimtxt"

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
