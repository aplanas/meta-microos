SUMMARY = "Documentation for texlive-context"
DESCRIPTION = "This package includes the documentation for texlive-context"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66546"

RPM_NAME = "texlive-context-doc-2023.209.svn66546-55.1.noarch.rpm"
RPM_HASH = "ce16d8e81efcf002c207c9d5ff2e4fcdafb460469cfcbbbf4d8c131e754beaa4daf3d2260f0ad555e24857f8e5c0dfcfb4da552fb288aabf29c1a09f46e28ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-context.1 \
man-luatools.1 \
man-mtx-babel.1 \
man-mtx-base.1 \
man-mtx-bibtex.1 \
man-mtx-cache.1 \
man-mtx-chars.1 \
man-mtx-check.1 \
man-mtx-colors.1 \
man-mtx-context.1 \
man-mtx-dvi.1 \
man-mtx-epub.1 \
man-mtx-evohome.1 \
man-mtx-fcd.1 \
man-mtx-flac.1 \
man-mtx-fonts.1 \
man-mtx-grep.1 \
man-mtx-interface.1 \
man-mtx-metapost.1 \
man-mtx-modules.1 \
man-mtx-package.1 \
man-mtx-patterns.1 \
man-mtx-pdf.1 \
man-mtx-plain.1 \
man-mtx-profile.1 \
man-mtx-rsync.1 \
man-mtx-scite.1 \
man-mtx-server.1 \
man-mtx-spell.1 \
man-mtx-texworks.1 \
man-mtx-timing.1 \
man-mtx-tools.1 \
man-mtx-unicode.1 \
man-mtx-unzip.1 \
man-mtx-update.1 \
man-mtx-vscode.1 \
man-mtx-watch.1 \
man-mtx-youless.1 \
man-mtxrun.1 \
texlive-context-doc"

RDEPENDS:${PN} += ""

inherit rpm
