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

RPM_NAME = "python3-seccomp-2.5.4-2.5.aarch64.rpm"
RPM_HASH = "0374b98e897a6bec21efe5ebc8fa246252995d9d5dd73e6a57f67953cb9f58454845849711d10556e91893da77b24dd122edb12225dcbfe42a63fa6ebe14d398"

RPROVIDES:${PN} += "python3-seccomp \
python3.11dist-seccomp \
python3dist-seccomp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseccomp.so.2 \
python-abi"

inherit rpm
