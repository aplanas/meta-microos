SUMMARY = "C++ API of libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the shared libraries for libconfig."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig++11-1.7.3-1.8.aarch64.rpm"
RPM_HASH = "bb2bfdd1db5dd83d6ed3a6a66ee768d94b609aadfe3368751c14c91e26a1c17e04554f56790456df53b59f4d17488c3255edd0552b9540dce2bc44d5fe34886a"

RPROVIDES:${PN} += "libconfig++.so.11 \
libconfig++11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
