SUMMARY = "Extra commands for bussproofs.sty"
DESCRIPTION = "This package provides additional functionality for \
bussproofs.sty; specifically, it allows for typesetting of \
entire (sub)deductions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn51299"

RPM_NAME = "texlive-bussproofs-extra-2023.209.0.0.4svn51299-53.1.noarch.rpm"
RPM_HASH = "f5d1ada24575a63512c63326ddcfda9a7e254cc076f8202f26efb77bdd2912e7d9eeaaefaace1e2d35f480cedc0fac09a09735596509eeec724e2207bd75203e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bussproofs-extra.sty \
texlive-bussproofs-extra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bussproofs.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
