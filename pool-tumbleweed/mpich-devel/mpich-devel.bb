SUMMARY = "SDK for MPICH  version 4.1.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "a51412f42f017a1e729b504e3dcc8c711fe6c5fdeb99dd44b84d6da4c748392f8dc885aaf4ee377e3514fda07b395443f0c680decbed001db8105ee34243d1bd"

RPROVIDES:${PN} += "mpich-devel"

RDEPENDS:${PN} += "libstdc++-devel \
mpich"

inherit rpm
