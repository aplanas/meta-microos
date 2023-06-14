SUMMARY = "Read and parse text tables"
DESCRIPTION = "This experimental package can read and parse text tables \
delimited by user-defined tokens (e.g., tab). It can be used \
for serial letters and the like, making it easier to export the \
data file from MS-Excel/MS-Word"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16549"

RPM_NAME = "texlive-delimtxt-2023.201.svn16549-52.1.noarch.rpm"
RPM_HASH = "43cfc5605e3d99139810f88ac6346cd9d0f758bb85ce4ab6eedf6cd367554f87669033572565f25fe6a5870a243625f1f566125dba98799921cefca7badb6265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimtxt.sty \
texlive-delimtxt"

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
