SUMMARY = "Chinese dummy text"
DESCRIPTION = "This package provides an interface to dummy text in Chinese \
language, which will be useful for testing Chinese documents. \
UTF-8, GBK and Big5 encodings are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-2023.201.1.2.0svn54994-52.1.noarch.rpm"
RPM_HASH = "769f4275d88b7edf89f126e51caedd398f08d831501c92490f63a73a6c5cee71b42907a40e7a9513acdd0a50591d3e7eb134c85e2d58b56e565990417d368c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhlipsum-big5.def \
tex-zhlipsum-gbk.def \
tex-zhlipsum-utf8.def \
tex-zhlipsum.sty \
texlive-zhlipsum"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
