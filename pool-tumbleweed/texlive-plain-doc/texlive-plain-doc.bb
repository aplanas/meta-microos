SUMMARY = "A list of plain.tex cs names"
DESCRIPTION = "The document constitutes a list of every control sequence name \
(csname) described in the TeXbook, together with an indication \
of whether the csname is a primitive TeX command, or is defined \
in plain.tex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28424"

RPM_NAME = "texlive-plain-doc-2023.209.svn28424-52.1.noarch.rpm"
RPM_HASH = "28c53206a7442775d22934af6d5ae1055b1db1839c02703dbed6cd648f765383a96dce18f057754fbc1ed388cdce5432caf011a13ce9fd20181d40b27fa6b9e5"
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
