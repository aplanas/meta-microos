SUMMARY = "Print a block of code, with unique index number"
DESCRIPTION = "The package has been created for the convenience of the report \
writer; it provides the means to number, and label, code-block \
snippets in your document. In this way, you can (unambiguously) \
refer to each snippet elsewhere in your document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn33109"

RPM_NAME = "texlive-numberedblock-2023.209.1.10svn33109-55.1.noarch.rpm"
RPM_HASH = "bf3f76748a4b6c36ca7152caaa52a0a44a3cee27251dc010a7c1c013a01ca721181a14bc42742de8958fd2f3fd061884fbb72cfcc8dabb37ff0f82f76756b74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numberedblock.sty \
texlive-numberedblock"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
tex-verbatimbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
