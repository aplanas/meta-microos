SUMMARY = "An enhanced Seccomp (mode 2) helper library"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "libseccomp2-2.5.4-2.8.aarch64.rpm"
RPM_HASH = "d4b4678ba567e7ebd6f552715b75c4270e28bef9acb22e38b7ae691a20a93d72f6e507c730e8679eaabbf06a1c1164eeb0d78b0cf4f1b0b1cf15cdc44eea8aea"

RPROVIDES:${PN} += "libseccomp.so.2()(64bit) \
libseccomp2 \
libseccomp2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
