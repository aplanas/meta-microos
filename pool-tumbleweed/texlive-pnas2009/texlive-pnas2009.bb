SUMMARY = "BibTeX style for PNAS (newer version)"
DESCRIPTION = "This style produces bibliographies in the format of \
'Proceedings of the National Academy of Sciences, USA'. The \
style was derived from the standard unsrt.bst and adapted to \
the new (2009) formatting rules."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16287"

RPM_NAME = "texlive-pnas2009-2023.201.1.0svn16287-52.1.noarch.rpm"
RPM_HASH = "5804ae5ee4fe1a2b87183bfa86fe3870bf36e2303a1d1080d3116760925b464c264b44d836fefa57c3f34b78135edf12d12b8d5c481833682b567d4960fa7429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pnas2009"
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
