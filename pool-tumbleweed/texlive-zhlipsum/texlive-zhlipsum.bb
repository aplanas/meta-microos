SUMMARY = "Chinese dummy text"
DESCRIPTION = "This package provides an interface to dummy text in Chinese \
language, which will be useful for testing Chinese documents. \
UTF-8, GBK and Big5 encodings are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-2023.201.1.2.0svn54994-52.2.noarch.rpm"
RPM_HASH = "91051b0d8b8c0124112f38fb384f2a7aab141f22731bd1306d9f847bd476350987dc88b38ba6e71334b710eac03a3ef300255327d8e41261c7cdb373121204ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhlipsum-big5.def \
tex-zhlipsum-gbk.def \
tex-zhlipsum-utf8.def \
tex-zhlipsum.sty \
texlive-zhlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
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
