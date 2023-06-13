SUMMARY = "Extensive control of page headers and footers in LaTeX2e"
DESCRIPTION = "The package provides extensive facilities, both for \
constructing headers and footers, and for controlling their use \
(for example, at times when LaTeX would automatically change \
the heading style in use)."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1svn64977"

RPM_NAME = "texlive-fancyhdr-2023.201.4.1svn64977-52.1.noarch.rpm"
RPM_HASH = "1e140554b368bd6d33ef9e774ea24d58e74456ad6ff03aa8da9adf3f5924e87f7d959a0a4773e674660bd6941747f0a719726ca105308d81ce2d00e86b34465b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(extramarks.sty) \
tex(fancyhdr.sty) \
tex(fancyheadings.sty) \
texlive-fancyhdr"

RDEPENDS:${PN} += "/bin/sh \
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
