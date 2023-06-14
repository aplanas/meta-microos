SUMMARY = "Basic Linear Algebra Communication Subprograms"
DESCRIPTION = "The BLACS (Basic Linear Algebra Communication Subprograms) project \
provides a linear algebra oriented message passing interface for \
a large range of distributed memory platforms. \
 \
The length of time required to implement efficient distributed memory \
algorithms makes it impractical to rewrite programs for every new \
parallel machine. The BLACS exist in order to make linear algebra \
applications both easier to program and more portable."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-mvapich2-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "7668eb289610e41d23a7805c4548c86d776436a3db31fde830ce0f6d1fd551e05ff440068819b156666c073c3ee0e665fb91108906f98fb5e71bdd01caf177ec"

RPROVIDES:${PN} += "libblacs.so.2.1.0 \
libblacs2-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
