SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. gitinfo2 is a new release of gitinfo. The changes \
to version 2 are not backward-compatible, and the package name \
has been changed to avoid impact on existing users' \
repositories. All new repositories should use this version of \
the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn38913"

RPM_NAME = "texlive-gitinfo2-2023.201.2.0.7svn38913-53.2.noarch.rpm"
RPM_HASH = "c11e461aa33800acadc7c0256da8fee5872d646fe6d46e3ef7568cc765bbdc6d4fd8a92e239a9d8c661019577dfcf5f89cc1f7a57d6bfc5a402de9d5e7e3fa95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitexinfo.sty \
tex-gitinfo2.sty \
texlive-gitinfo2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
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
