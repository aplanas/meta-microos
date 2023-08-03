SUMMARY = "Babel/Polyglossia support for the Romansh language"
DESCRIPTION = "The package provides a language description file that enables \
support of Romansh either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn30286"

RPM_NAME = "texlive-babel-romansh-2023.209.svn30286-54.1.noarch.rpm"
RPM_HASH = "97bbf3c2ba1b80aabad91d07554ae4a71113c02b7088a0e47f7b9a1ad63fe586e3367b240d38a02856e3f0874ea59d545aa7f8904f158db02c6b91f808c5dc1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romansh.ldf \
texlive-babel-romansh"

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
