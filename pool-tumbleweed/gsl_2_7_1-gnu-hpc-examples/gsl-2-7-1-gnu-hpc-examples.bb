SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-examples-2.7.1-1.4.noarch.rpm"
RPM_HASH = "cf11e2d1d253cfa7c4078323a7a87003da07943a1e7d732308be71aa479079ffd3d639bfbd6b13563ae6291fbfbe619ad19a2c496e8c40bc746a3c1e017ec836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
