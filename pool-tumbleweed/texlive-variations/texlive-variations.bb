SUMMARY = "Typeset tables of variations of functions"
DESCRIPTION = "The package provides macros for typesetting tables showing \
variations of functions according to French usage. These macros \
may be used by both LaTeX and plain TeX users."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-variations-2023.201.0.0.3svn15878-53.1.noarch.rpm"
RPM_HASH = "d11cf75458bec19b7cf1d22b8443a324eb231cc31b674891e5000012eabfc4e8c1e89be3748b0202aa43efa88ea8e6f5202dde117e2ffe4b0c299a63ca5486c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-variations.sty \
tex-variations.tex \
texlive-variations"

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
