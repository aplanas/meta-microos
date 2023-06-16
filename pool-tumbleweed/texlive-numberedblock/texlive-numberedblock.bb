SUMMARY = "Print a block of code, with unique index number"
DESCRIPTION = "The package has been created for the convenience of the report \
writer; it provides the means to number, and label, code-block \
snippets in your document. In this way, you can (unambiguously) \
refer to each snippet elsewhere in your document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn33109"

RPM_NAME = "texlive-numberedblock-2023.201.1.10svn33109-54.1.noarch.rpm"
RPM_HASH = "a60f542cea190fbfcb83b38837a8f6a0cef4fb9eb8479b48891f48fde05cae736c6fcea19a3d02c45544aacd1a8b64afb4ee16baeee063533e2257146460579a"
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
