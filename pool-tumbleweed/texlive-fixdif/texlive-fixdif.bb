SUMMARY = "Macros for typesetting differential operators"
DESCRIPTION = "This package redefines the \\d command in LaTeX and provides an \
interface to define new commands for differential operators. It \
is compatible with pdfTeX, XeTeX and LuaTeX, and can also be \
used with the unicode-math package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn66015"

RPM_NAME = "texlive-fixdif-2023.201.2.0bsvn66015-52.1.noarch.rpm"
RPM_HASH = "4c1f14d9e503364a56aed74c0c7c0cf8b65e3e3f1f7d385f3ab22688624102257beae1321eb360ceb35e2e868c2f5bca84dc9d0911a041ac94dff5d203288af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixdif.sty) \
texlive-fixdif"

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
