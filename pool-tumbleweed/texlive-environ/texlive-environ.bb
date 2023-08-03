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

RPM_NAME = "texlive-environ-2023.209.0.0.3svn56615-54.1.noarch.rpm"
RPM_HASH = "804b8833c404c2503d78bf7929209a92d8d0f3106057fe8edc1a48f295ea72ef8426e5cd07b908058432e9fa2b5ac739b13885527ac971c7c655b072918b1dde"
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
