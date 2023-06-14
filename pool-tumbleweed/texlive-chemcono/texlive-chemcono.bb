SUMMARY = "Support for compound numbers in chemistry documents"
DESCRIPTION = "A LaTeX package for using compound numbers in chemistry \
documents. It works like \\cite and the \\thebibliography, using \
\\fcite and \\theffbibliography instead. It allows compound names \
in documents to be numbered and does not affect the normal \
citation routines."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn17119"

RPM_NAME = "texlive-chemcono-2023.201.1.3svn17119-53.1.noarch.rpm"
RPM_HASH = "408cf1091c29e72f387f6f42704929f1d9a4cc00816c00c0efb58b0419d1ca9affe212be4e85d2a5e54f57c570f975afef022627186e930f36785d4c12a56956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemcono.sty \
tex-drftcono.sty \
tex-showkeysff.sty \
texlive-chemcono"

RDEPENDS:${PN} += "/bin/sh \
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
