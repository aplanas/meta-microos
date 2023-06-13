SUMMARY = "Utilities for the seccomp API"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. \
 \
This subpackage contains debug utilities for the seccomp interface."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "libseccomp-tools-2.5.4-2.8.aarch64.rpm"
RPM_HASH = "0869d4e8e01f05473d5c2b87b8fe840058e8c629940a4dddd281248140edafd2e607b2a3c2629cf060867737045fd9ea8a9d138b79a665409ab9e629c3061035"

RPROVIDES:${PN} += "libseccomp-tools \
libseccomp-tools(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libseccomp.so.2()(64bit)"

inherit rpm
