SUMMARY = "Numbered cases environment"
DESCRIPTION = "This package provides a LaTeX environment 'numcases' to produce \
multi-case equations with a separate equation number for each \
case. There is also a 'subnumcases' environment which numbers \
each case with the overall equation number plus a letter [8a, \
8b, etc.]."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn54682"

RPM_NAME = "texlive-cases-2023.209.3.2svn54682-53.1.noarch.rpm"
RPM_HASH = "80da3050f565422786382f9a73d71e81bb048e8107cd1f4c9db36daeed90773b1da0cc307e2c6c103027417928847edac7c02d84029f6ddb6d8243c0ee1e55cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cases.sty \
texlive-cases"

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
