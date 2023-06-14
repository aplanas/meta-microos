SUMMARY = "Python 3 bindings for seccomp"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. The libseccomp API abstracts \
away the underlying BPF-based syscall filter language and presents a \
more conventional function-call based filtering interface. \
 \
 \
This subpackage contains the python3 bindings for seccomp."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "python3-seccomp-2.5.4-2.4.aarch64.rpm"
RPM_HASH = "4f0710f786949d0ba287f3a37f69ed0d26ab62b76c0b3c3ec225474361bb3504ba8e6cb88262440912565d94b43943a9e49eca81e4454b2794da140d8fac5d05"

RPROVIDES:${PN} += "python3-seccomp \
python3.10dist-seccomp \
python3dist-seccomp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseccomp.so.2 \
python-abi"

inherit rpm
