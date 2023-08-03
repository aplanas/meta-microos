SUMMARY = "Extract variables from the name of the LaTeX file"
DESCRIPTION = "The package allows the user to extract information from the job \
name, provided that the name has been structured appropriately: \
the package expects the file name to consist of a set of words \
separated by hyphens."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44154"

RPM_NAME = "texlive-varsfromjobname-2023.209.1.0svn44154-54.1.noarch.rpm"
RPM_HASH = "a9fa58be5138db51c2e286e42b45a4d4becc15308f3071c9c2ee4bdb273128d8a35203e1cf0d203ed0000b37de0da0c56f2c7fc82eac0dd091a5fcdaa740fc5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varsfromjobname.sty \
texlive-varsfromjobname"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
