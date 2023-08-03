SUMMARY = "Pdfpc viewer-compatible hyperlinks to movies"
DESCRIPTION = "This LaTeX2e package provides a command \\pdfpcmovie for \
embedding (hyperlinking) movies in a way compatible with the \
PDF Presenter Console (pdfpc), a GPL2-licensed multi-monitor \
PDF presentation viewer application available on GitHub and \
shipped with some LINUX distributions such as Debian, Fedora, \
and Arch. The package depends on etoolbox, hyperref, and \
pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48245"

RPM_NAME = "texlive-pdfpc-movie-2023.209.1.0svn48245-52.1.noarch.rpm"
RPM_HASH = "1a2d962e788350d6a8634d9e276a2dc35d5654f3347279ff2fcac26935e7ef447c6d8bcf62f3e95a8909233901621a0f350352b7a404237a0dd776e64f486511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpc-movie.sty \
texlive-pdfpc-movie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
