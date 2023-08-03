SUMMARY = "Automated input of source"
DESCRIPTION = "The package provides a means of marking a source, so that \
samples of it may be included in a document (by means of the \
listings package) in a stable fashion, regardless of any change \
to the source. The markup in the source text defines tags for \
blocks of source. These tags are processed by a shell script to \
make a steering file that is used by the package when LaTeX is \
being run.y"
LICENSE = "LPPL-1.0"

PV = "2023.209.67svn29349"

RPM_NAME = "texlive-listings-ext-2023.209.67svn29349-55.1.noarch.rpm"
RPM_HASH = "65b9d790517f08a4c018e4893e00e128c02bcbbfba6d4539c493bbbe1b6cf9f12bfff473ac8b7e9e6d479af2a5abc22a5346d1858dad78b372442be55773afe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listings-ext.sty \
texlive-listings-ext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings-ext-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
