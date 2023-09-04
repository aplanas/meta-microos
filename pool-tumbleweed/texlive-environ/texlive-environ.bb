SUMMARY = "A new interface for environments in LaTeX"
DESCRIPTION = "The package provides the \\collect@body command (as in amsmath), \
as well as a \\long version \\Collect@Body, for collecting the \
body text of an environment. These commands are used to define \
a new author interface to creating new environments. For \
example, \\NewEnviron{test}, wraps the entire environment body \
in square brackets, doing the right thing in ignoring leading \
and trailing spaces."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn56615"

RPM_NAME = "texlive-environ-2023.209.0.0.3svn56615-54.2.noarch.rpm"
RPM_HASH = "f841af72b3de647e5aa6701f2056cc74d70b4245b104ef1dc3af15db8a89d5fe6c7e81c174394222e8d4d98a9f17d8e6d370e91386cb7a3b9aa1d1fb3857b3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-environ.sty \
texlive-environ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-trimspaces"

inherit rpm
