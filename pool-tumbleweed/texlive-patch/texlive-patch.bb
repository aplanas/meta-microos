SUMMARY = "Patch loaded packages, etcetera"
DESCRIPTION = "The package defines macros that allow patching of existing \
commands, specifying those parts of the existing macro to be \
replaced, along with the replacements. Thus it provides more \
sophisticated manipulation than a package like patchcmd, which \
only permits modification by adding commands at the beginning \
or end of an existing definition. The package is distributed in \
a relative of LaTeX doc format: it will run unmodified, though \
it benefits from docstrip treatment."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42428"

RPM_NAME = "texlive-patch-2023.209.svn42428-52.1.noarch.rpm"
RPM_HASH = "6746ac771a0d0a869cc9494e24cbd449749fbc92e41b3de6eb9dd431dc234975e9a21cf1527d75c049cea329973a913804e063e82ba343c4db04e4c317acc629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patch"

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
