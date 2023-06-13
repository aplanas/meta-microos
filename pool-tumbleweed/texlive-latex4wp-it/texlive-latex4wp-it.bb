SUMMARY = "LaTeX guide for word processor users, in Italian"
DESCRIPTION = "The package provides a version of the document in Italian"
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.0.10svn36000"

RPM_NAME = "texlive-latex4wp-it-2023.201.1.0.10svn36000-54.1.noarch.rpm"
RPM_HASH = "4473ab7915726c8c06bee66bb276c48e0c5cb86e6aae569925166c406cb1ac08fb11d7a3e68d1932b5b06a9dc6e46f5e4c0897fb05d7f092a9969818da53a80a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4wp-it"

RDEPENDS:${PN} += "/bin/sh \
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
