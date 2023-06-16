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

PV = "2023.201.0.0.7svn24638"

RPM_NAME = "texlive-jvlisting-2023.201.0.0.7svn24638-55.1.noarch.rpm"
RPM_HASH = "cfa181bc40f68040bffebe9246d32a5cf74cbd1516f8fa8045276b1d04abf70c4e7d446431d6ff5164b83045036bfebb58f6a5dab5fdd8bd3b7eea244d26b893"
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
