SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. Note this version is now deprecated, but is kept \
on the archive, pro tem, for continuity for existing users. All \
new repositories should use gitinfo2."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34049"

RPM_NAME = "texlive-gitinfo-2023.209.1.0svn34049-54.2.noarch.rpm"
RPM_HASH = "29f38224e1d37acb726407bfa0109e5b231c2a7ba91fa4db22ac602fc81d14b71741840474c3dfe2fdc09959f4e8a5fdb23a63b686a9d3240f0a109d7e3a4e57"
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
