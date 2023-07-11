SUMMARY = "Development files for libseccomp, an enhanced Seccomp (mode 2) helper library"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface. \
 \
This package contains the development files for libseccomp."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "libseccomp-devel-2.5.4-2.10.aarch64.rpm"
RPM_HASH = "9f2fcfbe15dff2d6bf114241985e3738373559b30de9fe648b3a858ace9d9367e3d93cfd70bb4fb7c898fe4cc9071b1c6a2f563dd6af51e841e258ab4a3bc7db"

RPROVIDES:${PN} += "libseccomp-devel \
pkgconfig-libseccomp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libseccomp2"

inherit rpm
