SUMMARY = "Macros for named tensor notation"
DESCRIPTION = "This style file provides macros for named tensor notation. \
Please see the paper 'Named Tensor Notation' for background on \
this notation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn65346"

RPM_NAME = "texlive-namedtensor-2023.209.0.0.4svn65346-55.1.noarch.rpm"
RPM_HASH = "26a70c06d863721718f942dc55372ddd399db07e336bbb08d78d9470af87c527741a769adc423959963b25345b85f2191f09c6cece554f07bf49e75a52aa1990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-namedtensor.sty \
texlive-namedtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
