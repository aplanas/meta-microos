SUMMARY = "A comparison of packages showing LaTeX file information"
DESCRIPTION = "The package provides an HTML file that lists and compares CTAN \
packages that display LaTeX source file information from \
\\ProvidesClass, \\ProvidesFile, and \\ProvidesPackage commands in \
the LaTeX file. Five packages of the author's, and several \
other packages are discussed; revision control systems are \
mentioned briefly."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.22svn26760"

RPM_NAME = "texlive-latexfileinfo-pkgs-2023.209.0.0.22svn26760-55.1.noarch.rpm"
RPM_HASH = "595dd8aba529cbfc7a0295b2a598fd3d519175f73f455a0967b912b5078ea46c7267954901ad42c1b04529d85f2f97ade3213081c2de5731854729b4e557e721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileinfo-pkgs"

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
