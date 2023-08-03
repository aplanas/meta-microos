SUMMARY = "Extend the doc package"
DESCRIPTION = "The doc package provides LaTeX developers with means to \
describe the usage and the definition of new macros and \
environments. However, there is no simple way to extend this \
functionality to other items (options or counters, for \
instance). The DoX package is designed to circumvent this \
limitation."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn46011"

RPM_NAME = "texlive-dox-2023.209.2.4svn46011-53.1.noarch.rpm"
RPM_HASH = "e16e316bec9c3fabbbb4440636a5b5db49587ccf3efac7addc114a14e5f43f123632633e619b3c39b2cec69cd954ec3af925b4566d478cec9ba57b50a6b81ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dox.sty \
texlive-dox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
