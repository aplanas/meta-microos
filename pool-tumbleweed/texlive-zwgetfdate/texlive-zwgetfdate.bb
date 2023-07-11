SUMMARY = "Get package or file date"
DESCRIPTION = "The package can fetch the date declaration of packages and \
files used by a document, and then provide the information in \
macros. The facilities provide a means of obtaining the date of \
a package being documented; this is mainly of use when \
doc/docstrip."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-zwgetfdate-2023.201.svn15878-52.2.noarch.rpm"
RPM_HASH = "e9753147a03e2ce4d709482af0dee0702c154f8e31205bb5c995391cb8501c1e6a435630f19d4ba09bf48b55cd9f41140c11a20acc55053a42225d8db70a11af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zwgetfdate.sty \
texlive-zwgetfdate"

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
