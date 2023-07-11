SUMMARY = "Development libraries for BLACS (openmpi2)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi2-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "511ce5831af77224e966bef6a6800ccc6218504b4f05f31e332f3b58cd6315e9132cf4fb5ceda2a3b22e01e4b4ed47bc374b38839c1151e0a859c3415e1088cb"

RPROVIDES:${PN} += "blacs-openmpi2-devel \
libblacs.so.2.1.0 \
libblacs2-openmpi2-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi2 \
libc.so.6 \
libmpi.so.20 \
openmpi2-devel"

inherit rpm
