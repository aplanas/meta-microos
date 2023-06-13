SUMMARY = "First aid for external LaTeX files and packages that need updating"
DESCRIPTION = "This package contains some first aid for LaTeX packages or \
classes that require updates because of internal changes to the \
LaTeX kernel that are not yet reflected in the package's or \
class's code. The file latex2e-first-aid-for-external-files.ltx \
provided by this package is meant to be loaded during format \
generation and not by the user."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0usvn64892"

RPM_NAME = "texlive-firstaid-2023.201.1.0usvn64892-52.1.noarch.rpm"
RPM_HASH = "9670418985cf799a3ca686dd4bd36587ac53bd237c24e778cde085d06038ddde7719f9a2ca46e1efc6d343d9a38cf923e0c08be5ae149fca92d5742e9d05a67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(everysel-ltx.sty) \
tex(filehook-ltx.sty) \
texlive-firstaid"

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
