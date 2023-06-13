SUMMARY = "A utility for rendering TikZ diagrams to SVG"
DESCRIPTION = "This package provides a shell script that calls XeTeX and \
pdf2svg to convert TikZ environments to SVG files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3.0svn60289"

RPM_NAME = "texlive-tikztosvg-2023.201.0.0.3.0svn60289-52.1.noarch.rpm"
RPM_HASH = "d3b3596837666c8736fcd44e3bd92851041e24a23633fc0b345e5aae22ee1f45d6bc532eb4dea74dfff821eb3839dd98434ff560adc7ab216f281134252cbd01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikztosvg"

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
texlive-scripts-bin \
texlive-tikztosvg-bin"

inherit rpm
