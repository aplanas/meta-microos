SUMMARY = "Display numbers in maths mode according to ISO 31-0"
DESCRIPTION = "The package makes a quick hack to ziffer to display numbers in \
maths mode according to ISO 31-0, regardless of input format \
(European $1.235,7$ or Anglo-American $1,235.7$). The options \
[euro, anglo] control the global input format. Default input \
format is anglo. Documentation is included as comments to the \
text source."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17362"

RPM_NAME = "texlive-isonums-2023.209.1.0svn17362-56.1.noarch.rpm"
RPM_HASH = "38b34f46ceefc8088cb3d936b92810f2063666ebeeba1e36f9e97097a275bf2b1e5b024fbf15801fd9780dfb368b434d1c753d0ed864d80bca5f5190cef4227a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isonums.sty \
texlive-isonums"

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
