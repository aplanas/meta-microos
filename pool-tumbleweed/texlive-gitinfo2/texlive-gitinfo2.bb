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

PV = "2023.209.2.0.7svn38913"

RPM_NAME = "texlive-gitinfo2-2023.209.2.0.7svn38913-54.2.noarch.rpm"
RPM_HASH = "b890402a4f4a7e20bed7376bc50259e020eec45162fd6114e8c952f89ed717b5c44d18c135c257cbbdcbc3e3cf7e2cc7344af4fcff6e25d09efaa963e8653439"
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
