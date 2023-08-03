SUMMARY = "Allow multiple web change files"
DESCRIPTION = "Tie was originally developed to allow web programmers to apply \
more than one change file to their source. The program may also \
be used to create a new version of a .web file that \
incorporates existing changes."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn66186"

RPM_NAME = "texlive-tie-2023.209.2.4svn66186-55.1.noarch.rpm"
RPM_HASH = "bb1dd9b1b6247ebbc30c492539c312f6ec4c12875dd11dd07945eb56aed2bb40bf4f6cf5075af423b5090bfe46e38c525d27009702ac9ac9d0e6705658a55b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tie.1 \
texlive-tie"

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
texlive-scripts-bin \
texlive-tie-bin"

inherit rpm
