SUMMARY = "Multiple versions of a bibliography, with different sort orders"
DESCRIPTION = "This package is a rewrite of the multibibliography package \
providing multiple bibliographies with different sorting. The \
new version offers a number of citation commands, streamlines \
the creation of bibliographies, ensures compatibility with the \
natbib package, and provides other improvements."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn37984"

RPM_NAME = "texlive-nmbib-2023.209.1.04svn37984-55.1.noarch.rpm"
RPM_HASH = "8188bbe5001c27c6eaf107a70278c8a76faff3566675c2381bc7ee50324aab06345eb20b2068406302eaa2fd290c798668fc782da7114665ce73ed1ecacb56d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nmbib.sty \
texlive-nmbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
