SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "python3-selinux-3.5-2.1.aarch64.rpm"
RPM_HASH = "8abc0fc33d402b4767c2e3896b655efb97f259267022c7bbaab686add56ea271a60b7dbb5685cd8a0b469c9a1d613b30e9835fe00aa2b25baf749071edc01350"

RPROVIDES:${PN} += "python3-selinux \
python3.10dist-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi \
python3"

inherit rpm
