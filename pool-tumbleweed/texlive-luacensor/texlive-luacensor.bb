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

PV = "2023.201.1.1.0svn62167"

RPM_NAME = "texlive-luacensor-2023.201.1.1.0svn62167-52.1.noarch.rpm"
RPM_HASH = "fd571720f8e672475608316ef9089fcdeb80870039ff07d51ed06a8b9fbb0370b6070bb077a38b38298d05de3f0beea72717ac8e1f760d2edc71dd98cddc6240"
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
