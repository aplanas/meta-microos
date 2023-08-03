SUMMARY = "First aid for external LaTeX files and packages that need updating"
DESCRIPTION = "This package contains some first aid for LaTeX packages or \
classes that require updates because of internal changes to the \
LaTeX kernel that are not yet reflected in the package's or \
class's code. The file latex2e-first-aid-for-external-files.ltx \
provided by this package is meant to be loaded during format \
generation and not by the user."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0usvn64892"

RPM_NAME = "texlive-firstaid-2023.209.1.0usvn64892-53.1.noarch.rpm"
RPM_HASH = "34d0774df0cfab9f4e6f4a339da44f6bf0b473b7e91bf1790273c921633c5b565382228cd36581838b0a53a94b5e386ec6d1614371592d653cc5048f30c0c489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everysel-ltx.sty \
tex-filehook-ltx.sty \
texlive-firstaid"

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
