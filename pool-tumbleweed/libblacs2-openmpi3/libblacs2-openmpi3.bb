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

RPM_NAME = "libblacs2-openmpi3-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "e98a4cda0ff575cc4a24033fe8b4ddec7e5faf65ceda06a6ffdb8194f8175e0c9623db97c82190d914b2ef6b2daa9cfef603f699c947b1c73b19ca9d4d260702"

RPROVIDES:${PN} += "libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi3 \
libblacs2-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmpi.so.40()(64bit)"

inherit rpm
