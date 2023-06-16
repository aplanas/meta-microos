SUMMARY = "Non-variable M PLUS Code Latin 60 font"
DESCRIPTION = "A monospaced font with 7 weights from Thin to Bold. \
M PLUS Code Latin 60 has a 60% character width."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus-code-latin60-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "accb52cf396e44d67a6bcf5485c31b82a459a92e279b7259835c692b7aa768958b9d71d3b6268197a0afa75c0ab19387f398ac8ec80a1896ede4e06a3167b0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-code-latin60-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
