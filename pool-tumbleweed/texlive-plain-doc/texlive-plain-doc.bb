SUMMARY = "A list of plain.tex cs names"
DESCRIPTION = "The document constitutes a list of every control sequence name \
(csname) described in the TeXbook, together with an indication \
of whether the csname is a primitive TeX command, or is defined \
in plain.tex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28424"

RPM_NAME = "texlive-plain-doc-2023.201.svn28424-51.1.noarch.rpm"
RPM_HASH = "1f2878eccc3ba91861e31f56feab6153d32d57b611d65dc824c8f50948e0b37cc3b87ae7c52b08f8b62144570e7c47c1232a6fd6be21751258e21e699ee8a042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plain-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
