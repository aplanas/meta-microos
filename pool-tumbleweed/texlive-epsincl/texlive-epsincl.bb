SUMMARY = "Include EPS in MetaPost figures"
DESCRIPTION = "The package facilitates including EPS files in MetaPost \
figures; it makes use of (G)AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-2023.209.0.0.2svn29349-54.2.noarch.rpm"
RPM_HASH = "4c0611eb64603c341fef46091840cbd80bca37b9d1f671710920c9640b49bbd52fbae408dfdb1244a3ca51b5d1dc67746bc46e643ed7e00ebb984b8e8fb8c66b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl"

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
