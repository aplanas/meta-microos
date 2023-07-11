SUMMARY = "Securely redact sensitive information using Lua"
DESCRIPTION = "This package provides simple tools for creating redacted Its \
tools are useful for lawyers, workers in sensitive industries, \
and others who need to easily produce both unrestricted \
versions of documents (for limited, secure release) and \
restricted versions of documents (for general release) \
Redaction is done both by hiding all characters and by slightly \
varying the length of strings to prevent jigsaw identification. \
It also is friendly to screen readers by adding alt-text \
indicating redacted content."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1.0svn62167"

RPM_NAME = "texlive-luacensor-2023.208.1.1.0svn62167-53.1.noarch.rpm"
RPM_HASH = "0c177d05bacac16d8465ed8e697222f020a17ce789d00f21c4f1d6b16227df4bbd30e285eb829df3d5c8d0fab9e4a26e7784fc5366a9c4442887635fb3d6b6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacensor.sty \
texlive-luacensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-environ.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-luacode.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
