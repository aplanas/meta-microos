SUMMARY = "BibTeX variant supporting Unicode (UTF-8), via ICU"
DESCRIPTION = "An enhanced, portable C version of BibTeX. Unicode is supported \
via the ICU library. Originally written by Yannis Haralambous \
and his students, and derived from bibtex8, with substantial \
updates from the Japanese TeX Development Community, it is now \
maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.72svn66186"

RPM_NAME = "texlive-bibtexu-2023.201.3.72svn66186-53.1.noarch.rpm"
RPM_HASH = "67a1524ca948bbad2d03b16fb8dab563acc6d69721fa3edb98fd523c86f4f19457446c42e639186c010ffc90079223da0b40fb7c796ea74f1e35ea65f31c1c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtexu.1 \
texlive-bibtexu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtexu-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
