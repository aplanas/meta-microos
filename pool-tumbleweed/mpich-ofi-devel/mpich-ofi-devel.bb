SUMMARY = "SDK for MPICH  version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "a467a72298662f1e045c47a7636832be9eaf65021273b9756c92ea66b72feba22cc8b228e6ef402135f1953d1301e4f71d2bb01e349370df335adb8956c86ea3"

RPROVIDES:${PN} += "mpich-ofi-devel"

RDEPENDS:${PN} += "libstdc++-devel \
mpich-ofi"

inherit rpm
