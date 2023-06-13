SUMMARY = "Macros for named tensor notation"
DESCRIPTION = "This style file provides macros for named tensor notation. \
Please see the paper 'Named Tensor Notation' for background on \
this notation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn65346"

RPM_NAME = "texlive-namedtensor-2023.201.0.0.4svn65346-54.1.noarch.rpm"
RPM_HASH = "4eba65c0a798562a878d209862db721f95b9f4c1caa1b6a0d33846ce96372532063821e16ab5cac60f2c18056fdb37a5f1edd9575f047e9f286985a05cbe1892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(namedtensor.sty) \
texlive-namedtensor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
