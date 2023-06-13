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

RPM_NAME = "votca-bash-2022.1-3.6.noarch.rpm"
RPM_HASH = "b052b12a309f2b03d9499f9bd0892420c0cf90a0833c1ac8bba1a66862cb165941c7629b1bb8da7042cceae4ca41d6fe5490bc3698129047f9b7f8a220149083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-bash \
votca-csg-bash"

RDEPENDS:${PN} += "bash-completion \
votca"

inherit rpm
