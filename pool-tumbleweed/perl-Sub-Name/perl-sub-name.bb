SUMMARY = "(Re)name a sub"
DESCRIPTION = "This module has only one function, which is also exported by default:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.27"

RPM_NAME = "perl-Sub-Name-0.27-1.2.aarch64.rpm"
RPM_HASH = "a05fcce88cef0427a697a74bdcec03bb7e46409697aba6d5a3e5b32569341b8b033b66bf1746fc617eae5e534ec0d6164a4353bb5e570d6577825676045a5b1c"

RPROVIDES:${PN} += "perl-Sub--Name \
perl-Sub-Name"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
