SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. Note this version is now deprecated, but is kept \
on the archive, pro tem, for continuity for existing users. All \
new repositories should use gitinfo2."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34049"

RPM_NAME = "texlive-gitinfo-2023.201.1.0svn34049-53.2.noarch.rpm"
RPM_HASH = "2e8f4f00c5847c37d2ddd7fdc976c02434228176023d4986084e375e79a98363b18447fac40010f57b36035566fb6a63bfcda8bae5036fb6c5d783d123726a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitinfo.sty \
tex-gitsetinfo.sty \
texlive-gitinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
