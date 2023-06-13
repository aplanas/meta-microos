SUMMARY = "Development libraries for BLACS (mvapich2)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-mvapich2-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "e869ca8ee4195f667d6e36e6b708554e3d9981959f294aa010b343e7ac291a360c7a092fec43baff9491deaf94bb9615b5a9d0b833c0d0dc55c69234cd9fe7ea"

RPROVIDES:${PN} += "blacs-mvapich2-devel \
libblacs.so.2.1.0()(64bit) \
libblacs2-mvapich2-devel \
libblacs2-mvapich2-devel(aarch-64)"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1()(64bit) \
libblacs2-mvapich2 \
libc.so.6()(64bit) \
libmpi.so.12()(64bit) \
mvapich2-devel"

inherit rpm
