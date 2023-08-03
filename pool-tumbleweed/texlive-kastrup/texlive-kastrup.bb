SUMMARY = "Convert numbers into binary, octal and hexadecimal"
DESCRIPTION = "Provides expandable macros for both fixed-width and \
minimum-width numbers to bases 2, 4, 8 and 16."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-kastrup-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "a42938d4170489c583df2ffbaa9fdda4b5ee39455f3d986f093acf5d25a54dc1ef8318e4aa8445e5d10e97e3595850abf88574de81919570c3af01dd093ee05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-binhex.tex \
texlive-kastrup"

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
