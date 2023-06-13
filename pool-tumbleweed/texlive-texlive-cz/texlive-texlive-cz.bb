SUMMARY = "TeX Live manual (Czech/Slovak)"
DESCRIPTION = "The texlive-cz package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62854"

RPM_NAME = "texlive-texlive-cz-2023.201.svn62854-54.1.noarch.rpm"
RPM_HASH = "bbb933e8834a2b257488e5c2da9024139671407b37dc9b39fa157b0a52b2a9bed168b3396c40d9d3651f117c1f1f45b20904d0390962e2cf671707492d1cda6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-cz"

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
