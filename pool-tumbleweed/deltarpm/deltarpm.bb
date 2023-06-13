SUMMARY = "Tools to Create and Apply deltarpms"
DESCRIPTION = "This package contains tools to create and apply deltarpms. A deltarpm \
contains the difference between an old and a new version of an RPM, \
which makes it possible to recreate the new RPM from the deltarpm and \
the old one. You do not need to have a copy of the old RPM, because \
deltarpms can also work with installed RPMs."
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "deltarpm-3.6.3-2.6.aarch64.rpm"
RPM_HASH = "62e45a81cbdede87cbb036757ae950b0bee4f2c4ef40616dd7f908b2e7ee62e88e709d6bf97d1ccdb186ad23fcdbfdadd79fcd059c3a9a90289813ec93273552"

RPROVIDES:${PN} += "deltarpm \
deltarpm(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
liblzma.so.5()(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
