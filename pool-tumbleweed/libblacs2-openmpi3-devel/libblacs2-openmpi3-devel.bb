SUMMARY = "Development libraries for BLACS (openmpi3)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi3-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "984e99fc83b9df5ae7c00b1a29b8dac397be7c394cffbefd2bfb16ebc4412ae07208cf746edf0384fe7845575d9a0edb2216e082053b7ffba6ca23715d7aa895"

RPROVIDES:${PN} += "blacs-openmpi3-devel \
libblacs.so.2.1.0 \
libblacs2-openmpi3-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi3 \
libc.so.6 \
libmpi.so.40 \
openmpi3-devel"

inherit rpm
