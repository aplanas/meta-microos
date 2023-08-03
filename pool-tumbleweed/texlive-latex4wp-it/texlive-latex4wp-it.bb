SUMMARY = "LaTeX guide for word processor users, in Italian"
DESCRIPTION = "The package provides a version of the document in Italian"
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.1.0.10svn36000"

RPM_NAME = "texlive-latex4wp-it-2023.209.1.0.10svn36000-55.1.noarch.rpm"
RPM_HASH = "0214046bd98aa34f7e9e08bdbebb1c0a2c81b191d2fb374bd15d63e3f2387e67ceedb1a412fda26d733084271463a9ebfd60af6bab519d78d685e1a14ba71e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4wp-it"

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
