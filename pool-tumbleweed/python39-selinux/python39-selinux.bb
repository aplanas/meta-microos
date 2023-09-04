SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "python39-selinux-3.5-4.1.aarch64.rpm"
RPM_HASH = "b8f58085aa1f03cf40a44a6d298efebb17b0edb6a5f664787c831cbd56fe56814fa7b90d91818422e71780b0e4fd0a26465b2b430304a94b9ab0e46d68745247"

RPROVIDES:${PN} += "python3.9dist-selinux \
python39-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi"

inherit rpm
