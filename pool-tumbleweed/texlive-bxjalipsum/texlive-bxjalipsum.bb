SUMMARY = "Dummy text in Japanese"
DESCRIPTION = "This package enables users to print some Japanese text that can \
be used as dummy text. It is a Japanese counterpart of the \
lipsum package. Since there is no well-known nonsense text like \
Lipsum in the Japanese language, the package uses some real \
text in public domain."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn66013"

RPM_NAME = "texlive-bxjalipsum-2023.209.1.0svn66013-53.1.noarch.rpm"
RPM_HASH = "bc45ee28813e063de3e9df025f9ac19736de372ae4596de05a84f4bf5a84abd7231a97f5223cef1229ebe15fa35c0eaf3a9d84ecb26e50288518fa573addbeff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjalipsum.sty \
texlive-bxjalipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-intcalc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
