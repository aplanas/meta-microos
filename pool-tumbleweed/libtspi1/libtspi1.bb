SUMMARY = "TSS (TCG Software Stack) access daemon for a TPM chip"
DESCRIPTION = "The trousers package provides a TSS implementation through the help of \
a user-space daemon, the tcsd, and a library  Trousers aims to be \
compliant to the 1.1b and 1.2 TSS specifications as available from the \
Trusted Computing website https://www.trustedcomputinggroup.org/. \
 \
The package needs the /dev/tpm device file to be present on your \
system. It is a character device file major 10 minor 224, 0600 tss:tss."
LICENSE = "BSD-3-Clause"

PV = "0.3.15"

RPM_NAME = "libtspi1-0.3.15-6.1.aarch64.rpm"
RPM_HASH = "ac0e908e7cb507897591773cf7794756a5c4f09a3b8bfb60ece18a8a2de1a9f51704be7fc064ad92b638a5844d19194d1182df789a0fa1ab2539713fa7ce76fd"

RPROVIDES:${PN} += "libtspi.so.1()(64bit) \
libtspi1 \
libtspi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
trousers"

inherit rpm
