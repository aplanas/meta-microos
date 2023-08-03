SUMMARY = "Macros for typesetting differential operators"
DESCRIPTION = "This package redefines the \\d command in LaTeX and provides an \
interface to define new commands for differential operators. It \
is compatible with pdfTeX, XeTeX and LuaTeX, and can also be \
used with the unicode-math package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn66015"

RPM_NAME = "texlive-fixdif-2023.209.2.0bsvn66015-53.1.noarch.rpm"
RPM_HASH = "2d09ae9c30006f203d36c78b8002ee46aca7e8028267eaac5981982b456fee4c39d8072d793a30a38f2802c46bfac3869fc80e42fbd41fa4f7272527627f41f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixdif.sty \
texlive-fixdif"

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
