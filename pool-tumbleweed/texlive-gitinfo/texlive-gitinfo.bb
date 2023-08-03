SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. Note this version is now deprecated, but is kept \
on the archive, pro tem, for continuity for existing users. All \
new repositories should use gitinfo2."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34049"

RPM_NAME = "texlive-gitinfo-2023.209.1.0svn34049-54.1.noarch.rpm"
RPM_HASH = "af3ba0ff952ea9cf5db279c9f2c33386d22962e6eecceea956b045edece07ad6afc8fae679fb2cf9a74c4883bff1e61ae0649595e5b8d3d521a2149a85174440"
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
