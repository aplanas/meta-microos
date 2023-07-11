SUMMARY = "Bash completion for votca"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the bash completion support for votca."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-bash-2022.1-3.7.noarch.rpm"
RPM_HASH = "929b9990b80e2e4f485a83784f1d08c3e498c792b046aa8cc8dea95cb4441a0d1a29ad5f1ee6b3bdbf23f8a9010b498d2bbb1261ffbcff87ab49f38d5dffb30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-bash \
votca-csg-bash"

RDEPENDS:${PN} += "bash-completion \
votca"

inherit rpm
