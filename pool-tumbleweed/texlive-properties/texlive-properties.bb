SUMMARY = "Load properties from a file"
DESCRIPTION = "The package loads properties (key, value) from a properties \
file, e.g. \\jobname.properties."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-properties-2023.209.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "322323012987fba06ed104e194be855e89283bee24e348c3e5250d2f8c698511405ec5fcf070e08ca7c791700309506f724a907f5dc4891a60d3f2f65ec8c70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-properties.sty \
texlive-properties"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
