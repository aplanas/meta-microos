SUMMARY = "Tools to Create and Apply deltarpms"
DESCRIPTION = "This package contains tools to create and apply deltarpms. A deltarpm \
contains the difference between an old and a new version of an RPM, \
which makes it possible to recreate the new RPM from the deltarpm and \
the old one. You do not need to have a copy of the old RPM, because \
deltarpms can also work with installed RPMs."
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "deltarpm-3.6.3-2.7.aarch64.rpm"
RPM_HASH = "fc7a907a0c3279b945b5642e144599abea38fb2d2c67ca02bd165dbf7e4ef2f7962c581672a7ddb361c102329783e32c7ba0e0d1fb6dd52bc32920b94042fe43"

RPROVIDES:${PN} += "deltarpm"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libzstd.so.1"

inherit rpm
