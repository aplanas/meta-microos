SUMMARY = "Constructions with braces to present mathematical demonstrations"
DESCRIPTION = "The LaTeX package cascade provides a command \\Cascade to do \
constructions to present mathematical demonstrations with \
successive braces for the deductions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn65757"

RPM_NAME = "texlive-cascade-2023.209.1.2asvn65757-53.1.noarch.rpm"
RPM_HASH = "bb39b363ae95be2aec3ce10afadf691bf79c1fa025819fa1315fe466c20f9282d5762bf2e5a3373a9f4c2ee01fe91d7c4dba4e29ca6788d1f5b9c7c62022e177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cascade.sty \
texlive-cascade"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
