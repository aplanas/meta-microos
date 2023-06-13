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

RPM_NAME = "texlive-gitinfo2-2023.201.2.0.7svn38913-53.1.noarch.rpm"
RPM_HASH = "0d7ff595f23faf57c3a156bab616f9fd453c0b4ee5f33706cc3b2687e7cd9d0e6f9ce5d86d90f72e1bed0091007279750d9877d27d9632656d9bd687917cce58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gitexinfo.sty) \
tex(gitinfo2.sty) \
texlive-gitinfo2"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(eso-pic.sty) \
tex(etoolbox.sty) \
tex(kvoptions.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
