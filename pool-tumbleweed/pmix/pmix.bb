SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "The Process Management Interface (PMI) has been used for quite some time as a \
means of exchanging wireup information needed for interprocess communication. Two \
versions (PMI-1 and PMI-2) have been released as part of the MPICH effort. While \
PMI-2 demonstrates better scaling properties than its PMI-1 predecessor, attaining \
rapid launch and wireup of the roughly 1M processes executing across 100k nodes \
expected for exascale operations remains challenging. \
 \
This RPM contains all the tools necessary to compile and link against PMIx."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "ac71a7b53bb8a931f542bae3ead38a4649a82d7139163bde5b1cf70d277975fba7210cb1c2b912e0e965c1eceac908f27c09eafa26c038a1c36c6bf2ef35c182"

RPROVIDES:${PN} += "pmix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpmix.so.2"

inherit rpm
