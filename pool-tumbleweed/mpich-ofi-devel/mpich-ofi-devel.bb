SUMMARY = "SDK for MPICH  version 4.1.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "3e63ac2ad73d8dd1c8f5f7bf4eea95f66fc46ac651f58c116308dd213a9ee8b6913be6c0f5e130888272c3c604120bf58991a28cd88a533bc8365eb971701433"

RPROVIDES:${PN} += "mpich-ofi-devel"

RDEPENDS:${PN} += "libstdc++-devel \
mpich-ofi"

inherit rpm
