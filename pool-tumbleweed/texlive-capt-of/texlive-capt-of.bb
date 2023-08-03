SUMMARY = "Captions on more than floats"
DESCRIPTION = "Defines a command \\captionof for putting a caption to something \
that's not a float. Note that the caption package includes a \
\\captionof command that is an extension of that provided by \
this package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-capt-of-2023.209.svn29803-53.1.noarch.rpm"
RPM_HASH = "476e0bf141727858543e9a94747c38693dd2db7d659d41cab38093c09148007c9e88008edc3b962fb5374a7b5282fdd4c3fce6a10988004a2040ee8255b42ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-capt-of.sty \
texlive-capt-of"

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
