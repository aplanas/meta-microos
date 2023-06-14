SUMMARY = "Make empty pages really empty"
DESCRIPTION = "This package prevents page numbers and headings from appearing \
on empty pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18064"

RPM_NAME = "texlive-emptypage-2023.201.1.2svn18064-53.1.noarch.rpm"
RPM_HASH = "e5f977f9ef5269950acb535103380d1d36c1c1cd804cd176d71b33878d68787ce1bf78a826263bafd56f7d9317248bed10acb0eff943fd3b4f7ad2552784d814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emptypage.sty \
texlive-emptypage"

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
