SUMMARY = "Support for compound numbers in chemistry documents"
DESCRIPTION = "A LaTeX package for using compound numbers in chemistry \
documents. It works like \\cite and the \\thebibliography, using \
\\fcite and \\theffbibliography instead. It allows compound names \
in documents to be numbered and does not affect the normal \
citation routines."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn17119"

RPM_NAME = "texlive-chemcono-2023.209.1.3svn17119-54.1.noarch.rpm"
RPM_HASH = "3788f07971b5b956381279c03d5ea4643a04175463ef4de41c44442fa7fb59671d49356d74894734caffee9bd5a86d8774fcdd7949f444aa799e0e5a498cd1e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemcono.sty \
tex-drftcono.sty \
tex-showkeysff.sty \
texlive-chemcono"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
