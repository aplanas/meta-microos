SUMMARY = "An enhanced Seccomp (mode 2) helper library"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "libseccomp2-2.5.4-2.10.aarch64.rpm"
RPM_HASH = "4d0bd57171bab7b44a963db1987e39a429af00025eb854c490537990c7f6cc196630c9aee4ed74ea851fdd99e4ffdd739fc1eb47cad10cef80a356af36f1226d"

RPROVIDES:${PN} += "libseccomp.so.2 \
libseccomp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
