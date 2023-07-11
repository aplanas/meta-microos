SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "python3-selinux-3.5-3.2.aarch64.rpm"
RPM_HASH = "74f1106c0ef7d200bd183610efed7f1be8eff2dde79202cce51bf87af5bb9be13b5bb64af3e3165791183848b772870d9d3a34357a5fc641c22d6284a10c468d"

RPROVIDES:${PN} += "python3-selinux \
python3.11dist-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi \
python3"

inherit rpm
