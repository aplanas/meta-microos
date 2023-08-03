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

RPM_NAME = "texlive-gitinfo2-2023.209.2.0.7svn38913-54.1.noarch.rpm"
RPM_HASH = "6359b0ab41dd5ac9525f865dcdf22552795969d954a81c678b0cf2962185b198c43c896bd781ae9bc344f7301d660d4cda9bc23df17944c0ec4df2c9e62c863d"
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
