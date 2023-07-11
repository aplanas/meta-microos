SUMMARY = "SDK for MPICH  version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "a70c965ee1dd564106a0a2d639ba56d1e055ea54ae8c210b90bcdf757e2a081d4425f08fc8d61b1a762abebe2ab994c669dec857dd61a31a809c4aa029e1c9c5"

RPROVIDES:${PN} += "mpich-devel"

RDEPENDS:${PN} += "libstdc++-devel \
mpich"

inherit rpm
