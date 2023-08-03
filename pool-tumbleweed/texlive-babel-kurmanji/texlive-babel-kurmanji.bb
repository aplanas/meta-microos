SUMMARY = "Babel support for Kurmanji"
DESCRIPTION = "The package provides the language definition file for support \
of Kurmanji in babel. Kurmanji belongs to the family of Kurdish \
languages. Some shortcuts are defined, as well as translations \
to Kurmanji of standard 'LaTeX names'. Note that the package is \
dealing with 'Northern' Kurdish, written using a Latin-based \
alphabet. The arabxetex package offers support for Kurdish \
written in Arabic script."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30279"

RPM_NAME = "texlive-babel-kurmanji-2023.209.1.1svn30279-54.1.noarch.rpm"
RPM_HASH = "f519df5a970f4bdf9ca56c9e22e61813d055337022ddb6a2a43889a9d5141b431d61e44de9ca7f0fcc72fb682b78e9a8e3b7eace5112703d089d23bb987fcb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kurmanji.ldf \
texlive-babel-kurmanji"

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
