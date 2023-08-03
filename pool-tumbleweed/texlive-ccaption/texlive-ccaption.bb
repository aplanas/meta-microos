SUMMARY = "Continuation headings and legends for floats"
DESCRIPTION = "A package providing commands for 'continuation captions', \
unnumbered captions, and also a non-specific legend heading for \
any environment. Methods are also provided to define captions \
for use outside float (e.g., figure and table) environments, \
and to define new float environments and Lists of Floats. Tools \
are provided for specifying your own captioning styles."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2csvn23443"

RPM_NAME = "texlive-ccaption-2023.209.3.2csvn23443-53.1.noarch.rpm"
RPM_HASH = "97c804be4d40002fcd9da2d122e79cb16fe3a231b6b8a584aceb3a06a82f320a8d1ba86bfcafcc076e8e52b3032ba32348d49512b50c080255cc77969f1c159a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccaption.sty \
texlive-ccaption"

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
