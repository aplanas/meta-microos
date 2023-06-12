SUMMARY = "A sophisticated package for typesetting stage plays"
DESCRIPTION = "This package enables the user to typeset stage plays in a way \
that permits to create highly customized printouts for each \
actor."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn45363"

RPM_NAME = "texlive-theatre-2023.201.0.0.1svn45363-54.1.noarch.rpm"
RPM_HASH = "2fd790dbcc615087452212a8342a47ec1a96ee26b3e16879331f7b6121c7d58830eb294b55eb627340b73ae525c05986910063b0d69aae7b4c5ab9fec000aa94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theatre"
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
