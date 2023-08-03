SUMMARY = "Fix JFM (for *pTeX)"
DESCRIPTION = "This package fixes several bugs in the JFM format. Both LaTeX \
and plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.8svn63967"

RPM_NAME = "texlive-fixjfm-2023.209.0.0.8svn63967-53.1.noarch.rpm"
RPM_HASH = "329e3fc222c445d83758424583288318aedb87d6a10b058912019507ea79f2cf93fa9b0c23922f76355c591516b64ae4e1858ec96e8e89474623152688b4dac5"
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
