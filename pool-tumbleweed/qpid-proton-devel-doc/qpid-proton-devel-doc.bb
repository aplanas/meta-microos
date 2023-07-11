SUMMARY = "Documentation for the C development libraries for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. \
 \
This subpackage contains the documentation."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "qpid-proton-devel-doc-0.38.0-1.6.noarch.rpm"
RPM_HASH = "4c1d1dd023bb89e8ff75e23be9c7e01417fb3687652c1cf7f3938ff9e8c8f7a6089dd29baf08ba623675af4402ff919c7cf6bfc456a0224bb3abbb2dce709ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpid-proton \
qpid-proton-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
