SUMMARY = "Some LaTeX kernel commands for general use"
DESCRIPTION = "This package exports some utility macros from the LaTeX kernel \
into a separate namespace and also makes them available for \
other formats such as plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.25svn56421"

RPM_NAME = "texlive-ltxcmds-2023.208.1.25svn56421-53.1.noarch.rpm"
RPM_HASH = "9670f71d2d856ab0fc69a6dd96acac1aaac2132cf232f9b1f810f349c6a0f16435823419e6d4ead18acef3a9bde6242467ab4f042be6826cbad0eaa154bae092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxcmds.sty \
texlive-ltxcmds"

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
