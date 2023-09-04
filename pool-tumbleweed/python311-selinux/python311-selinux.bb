SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "python311-selinux-3.5-4.1.aarch64.rpm"
RPM_HASH = "65e6ed1dba07fcafcf2e4f374f718be661c3289bc03fa2fc3251d1e7cb8757afffe27a3b7d3a7c3cedb42d7ab1c721dcf904e0f9520713bcae248ab92d580b16"

RPROVIDES:${PN} += "python3-selinux \
python3.11dist-selinux \
python311-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi"

inherit rpm
