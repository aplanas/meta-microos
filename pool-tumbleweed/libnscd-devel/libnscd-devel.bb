SUMMARY = "Development files for libnscd"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to communicate with a running nscd."
LICENSE = "LGPL-2.1+"

PV = "2.0.2"

RPM_NAME = "libnscd-devel-2.0.2-138.21.aarch64.rpm"
RPM_HASH = "28c21d4276e90d806ed602d9311b11784cf2976c9a240e821122e7d6647a058f7081f78ae7fdcb9437bcd532998d2641598b70f2fd00d0259e8439ec2a07cb2c"

RPROVIDES:${PN} += "libnscd-devel \
libnscd-devel(aarch-64)"

RDEPENDS:${PN} += "libnscd1"

inherit rpm
