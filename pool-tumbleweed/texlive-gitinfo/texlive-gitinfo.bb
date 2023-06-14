SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. Note this version is now deprecated, but is kept \
on the archive, pro tem, for continuity for existing users. All \
new repositories should use gitinfo2."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34049"

RPM_NAME = "texlive-gitinfo-2023.201.1.0svn34049-53.1.noarch.rpm"
RPM_HASH = "2ee7a6ee3277d7fa288453655fd000fb3f8532ed19347c5f2db47dbefc0af24a0f08b815c0037e5444eba8fa5dfc9b6c1b1d25d6f66fedc766f2cbba207b3bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitinfo.sty \
tex-gitsetinfo.sty \
texlive-gitinfo"

RDEPENDS:${PN} += "/bin/sh \
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
