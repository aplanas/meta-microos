SUMMARY = "Russian introduction to LaTeX"
DESCRIPTION = "Russian version of A Short Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn55643"

RPM_NAME = "texlive-lshort-russian-2023.209.svn55643-55.1.noarch.rpm"
RPM_HASH = "ae4676ed01666ab17282b4f743f0e9bd5cfcdc148a1c1587145491fd36be43a596ce34e1fc92b37d8fd12b3308348e4b64c1396d608e78abf69673be70d68e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-russian"

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
