SUMMARY = "Fixes for twocolumn floats"
DESCRIPTION = "The package solves two problems: floats in a twocolumn document \
come out in the right order and allowed float positions are now \
[tbp]. The package actually merges facilities from fixltx2e and \
stfloats."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn28983"

RPM_NAME = "texlive-dblfloatfix-2023.209.1.0asvn28983-53.1.noarch.rpm"
RPM_HASH = "98890a272f6ab9c7f62b91d161c416c10543456b1b38202fb0b8e8bcb0b24fa34ebba1fc342f19ab5497fb9ec474e95559f08e858336be1209fdb1703d61595a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dblfloatfix.sty \
texlive-dblfloatfix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixltx2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
