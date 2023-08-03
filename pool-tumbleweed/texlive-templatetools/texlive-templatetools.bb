SUMMARY = "Commands useful in LaTeX templates"
DESCRIPTION = "The package provides a collection of tools, which are helpful \
for the creation of a LaTeX template if conditional paths for \
code execution are required. All the commands work both in the \
preamble and in the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34495"

RPM_NAME = "texlive-templatetools-2023.209.svn34495-55.1.noarch.rpm"
RPM_HASH = "c3e6cb378afa056ace32af7e4590ccbd47d98fb132f58b2de124fc29a6c4b467e9c8e5af1f677d29db1f86db6ae8cbe14dd94903b6b260110cd0800167aa7c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-templatetools.sty \
texlive-templatetools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-etoolbox.sty \
tex-ifdraft.sty \
tex-ifpdf.sty \
tex-ltxcmds.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
