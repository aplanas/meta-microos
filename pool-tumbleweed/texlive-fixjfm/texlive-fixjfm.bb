SUMMARY = "Fix JFM (for *pTeX)"
DESCRIPTION = "This package fixes several bugs in the JFM format. Both LaTeX \
and plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.8svn63967"

RPM_NAME = "texlive-fixjfm-2023.201.0.0.8svn63967-52.1.noarch.rpm"
RPM_HASH = "72e08b2ae52394c3a7eba48db8384cb5f511969c9b6eb108d9bf3e6c284f5bd611d6016a72448d2f92f45a5e14bed854782cd3ef764fdb80a9d773bdce75125f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixjfm.sty \
texlive-fixjfm"

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
