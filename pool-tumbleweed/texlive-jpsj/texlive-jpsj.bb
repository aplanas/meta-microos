SUMMARY = "Document Class for Journal of the Physical Society of Japan"
DESCRIPTION = "The jpsj package"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn66115"

RPM_NAME = "texlive-jpsj-2023.201.1.2.2svn66115-55.1.noarch.rpm"
RPM_HASH = "374d45d28773bc5ca8f2f8a74bc9c97d10d3657a53f95797ae0319af8642c5c60a825eba9f310a0148cc7659d07088b6b50be502395ab3bf56e93f3f22d13606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jpsj2.cls) \
texlive-jpsj"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(graphicx.sty) \
tex(overcite.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
