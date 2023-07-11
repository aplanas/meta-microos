SUMMARY = "Utilities for the seccomp API"
DESCRIPTION = "The libseccomp library provides an interface to the Linux Kernel's \
syscall filtering mechanism, seccomp. \
 \
This subpackage contains debug utilities for the seccomp interface."
LICENSE = "LGPL-2.1-only"

PV = "2.5.4"

RPM_NAME = "libseccomp-tools-2.5.4-2.10.aarch64.rpm"
RPM_HASH = "4c5f42a10ecb466866cdf1c794b1b6a46c69a4fa2656f7551c6c927238b210c8c6c2db85e208a7d756ab82ef0af7b7fb8eea42ba9ac549f0f2fe166367a6e7e1"

RPROVIDES:${PN} += "libseccomp-tools"

RDEPENDS:${PN} += "libc.so.6 \
libseccomp.so.2"

inherit rpm
