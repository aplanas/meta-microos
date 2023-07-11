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

RPM_NAME = "libblacs2-openmpi1-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "50ccde31095ae77d3ed46db8b506c1859d6002ada60dcde143cfa94789d87ea1f1770d368a2efcacb28422af812eeca18ed532b93d5f62bd831a498d7961e969"

RPROVIDES:${PN} += "libblacs.so.2.1.0 \
libblacs2-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
