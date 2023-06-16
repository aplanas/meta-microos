SUMMARY = "Automated input of source"
DESCRIPTION = "The package provides a means of marking a source, so that \
samples of it may be included in a document (by means of the \
listings package) in a stable fashion, regardless of any change \
to the source. The markup in the source text defines tags for \
blocks of source. These tags are processed by a shell script to \
make a steering file that is used by the package when LaTeX is \
being run.y"
LICENSE = "LPPL-1.0"

PV = "2023.201.67svn29349"

RPM_NAME = "texlive-listings-ext-2023.201.67svn29349-54.1.noarch.rpm"
RPM_HASH = "200ad6fe0122bc08dbce77b0ce4543cd4f7c00631898ca85c0f3d003f9f7e5d66bbe49aaaec7abee68e40db779076e77c3404fe2e138d9bdf1afaa05320ec919"
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
