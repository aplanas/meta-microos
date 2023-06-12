SUMMARY = "Secure Replacements for Problematic C Functions"
DESCRIPTION = "The 'Secure Programming Library' provides several functions that should \
serve as a replacement for problematic C functions from glibc. Besides \
the replacement functions there are some helper-functions (like: \
safe_reopen() or sigprotection()) that can be used for developing \
exposed applications."
LICENSE = "GPL-2.0+"

PV = "0.8"

RPM_NAME = "libsecprog-devel-0.8-165.25.aarch64.rpm"
RPM_HASH = "c4e0ed977b28fd4e7b47ef9744ad0f8acc1c11fd5d5d6771d4ff7f6e563c3170f937ad43669d46217967a75ee6f1a1a7a1a2bd766e0b31f9cd032aaae76d25a1"

RPROVIDES:${PN} += "libsecprog-devel \
libsecprog-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libsecprog0"

inherit rpm
