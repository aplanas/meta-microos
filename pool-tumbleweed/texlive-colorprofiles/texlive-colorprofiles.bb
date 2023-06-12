SUMMARY = "Collection of free ICC profiles"
DESCRIPTION = "This package collects free ICC profiles that can be used by \
color profile aware applications/tools like the pdfx package, \
as well as TeX and LaTeX packages to access them."
LICENSE = "LPPL-1.0"

PV = "2023.201.20181105svn49086"

RPM_NAME = "texlive-colorprofiles-2023.201.20181105svn49086-53.1.noarch.rpm"
RPM_HASH = "f0bea1e830cac05bf39a44dcba5c983edd8a506bb9ba528f9e5493d7b875983f04dc8f5decb6daded84933dc1eaca7b9dc9b4f361f86c434a834211e01ccf89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colorprofiles.sty) \
tex(colorprofiles.tex) \
texlive-colorprofiles"
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
