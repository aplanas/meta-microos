SUMMARY = "A new interface for environments in LaTeX"
DESCRIPTION = "The package provides the \\collect@body command (as in amsmath), \
as well as a \\long version \\Collect@Body, for collecting the \
body text of an environment. These commands are used to define \
a new author interface to creating new environments. For \
example, \\NewEnviron{test}, wraps the entire environment body \
in square brackets, doing the right thing in ignoring leading \
and trailing spaces."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn56615"

RPM_NAME = "texlive-environ-2023.201.0.0.3svn56615-53.2.noarch.rpm"
RPM_HASH = "d8d50ec491a121102a10765537ba1f8f31256e1fc9c968e2ed7cab0b2dbcc5e8e1ba928cd23da0d20de59fcb0a609b2f3fc5b90b0ca77c23ab01509479973018"
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
