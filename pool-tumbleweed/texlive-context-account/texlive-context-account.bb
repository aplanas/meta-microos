SUMMARY = "A simple accounting package"
DESCRIPTION = "The package deals with 'accounts' of its own specification."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-account-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "f56c793b3ac663113fcdddae93eea8e3d64ed33b856587472c8ab680bf9021b893b0230b0d49cb3354b71bd5164d211951e062612fd8e89050ce527f84f87ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-account.tex \
tex-t-floatnumber.tex \
texlive-context-account"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
