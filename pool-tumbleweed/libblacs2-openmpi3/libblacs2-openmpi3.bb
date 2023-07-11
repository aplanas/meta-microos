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

RPM_NAME = "libblacs2-openmpi3-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "434056e0e8f19f40f3e0bebf6d01c99275bdbc669fa263f8f1b8e439039cd49277d6e33bc4356abee9e9ee1e82ea35e6995210a069fee45f83f604f78707d5a8"

RPROVIDES:${PN} += "libblacs.so.2.1.0 \
libblacs2-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40"

inherit rpm
