SUMMARY = "Pdfpc viewer-compatible hyperlinks to movies"
DESCRIPTION = "This LaTeX2e package provides a command \\pdfpcmovie for \
embedding (hyperlinking) movies in a way compatible with the \
PDF Presenter Console (pdfpc), a GPL2-licensed multi-monitor \
PDF presentation viewer application available on GitHub and \
shipped with some LINUX distributions such as Debian, Fedora, \
and Arch. The package depends on etoolbox, hyperref, and \
pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48245"

RPM_NAME = "texlive-pdfpc-movie-2023.201.1.0svn48245-51.1.noarch.rpm"
RPM_HASH = "3c9ad53d22eb2668c69feb8e1bf8656819a6b5ebc3d667033ec4a235702b5f4a2a6961dcfa75916bd19ffbb5282ac6e3e193c96bf1f96ab99dbbd58895eca032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfpc-movie.sty) \
texlive-pdfpc-movie"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(hyperref.sty) \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
