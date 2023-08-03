SUMMARY = "A simple package to set up document margins"
DESCRIPTION = "This package is considered obsolete; alternatives are the \
typearea package from the koma-script bundle, or the geometry \
package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-anysize-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "0383085aaceb86d3e008cd7a85e1e710cbdabb61ee87b0480f891d0172c941c75f5b1030722c2b1bcd77f9cef274df0c612b6a92b804e97deb8bcc4b7dc4f240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anysize.sty \
texlive-anysize"

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
