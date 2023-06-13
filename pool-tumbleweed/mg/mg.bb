SUMMARY = "Micro GNU Emacs clone"
DESCRIPTION = "Mg is micro GNU Emacs clone without lisp interpreter."
LICENSE = "Unlicense"

PV = "3.6"

RPM_NAME = "mg-3.6-1.1.aarch64.rpm"
RPM_HASH = "183bcc3484e56e083688dbdd4df3acf5d9cab744bf0774733a25dfac269208626cc5a0d6996d48bf7415fc2340b39ae6cd7cef021dca6803c20925a397591c56"

RPROVIDES:${PN} += "mg \
mg(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
