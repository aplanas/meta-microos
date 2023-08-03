SUMMARY = "A replacement for LaTeX's verbatim package"
DESCRIPTION = "This package provides a LaTeX environment listing, an \
alternative to the built-in verbatim environment. The listing \
environment is tailored for including listings of computer \
program source code into documents. The main advantages over \
the original verbatim environment are: environments \
automatically fixes leading whitespace so that the environment \
and program listing can be indented with the rest of the \
document source, and; listing environments may easily be \
customised and extended."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn24638"

RPM_NAME = "texlive-jvlisting-2023.209.0.0.7svn24638-56.1.noarch.rpm"
RPM_HASH = "302946cf79f82b7cbad9fc8d5d4bf2dd5dd8e69b1332dcb3ad9829ace621bfc5cdf4451e36e4191b63c532207d1eeffeb5b9bf6afe7138475babddb729dd231d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jvlisting.sty \
texlive-jvlisting"

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
