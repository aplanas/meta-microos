SUMMARY = "The process tools collection"
DESCRIPTION = "pbuildid dumps the build-ids of an executable, core file or a process, \
given the pid of that process. \
 \
 \
 \
Authors: \
-------- \
    Jan Blunck <jblunck@suse.de>"
LICENSE = "GPL-2.0+"

PV = "0.1"

RPM_NAME = "ptools-0.1-26.26.aarch64.rpm"
RPM_HASH = "954cc3ecf4a396c7b237e996e72469c482b41be45d866c8e10954b83382b8dce4f5a4779f1388d487c50301f8e6b7e17ad143cedd4d0239360570b77c2b92186"

RPROVIDES:${PN} += "ptools \
ptools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.3)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
