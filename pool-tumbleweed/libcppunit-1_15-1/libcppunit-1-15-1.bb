SUMMARY = "Cppunit library for writting C++ unittests"
DESCRIPTION = "Cppunit library for writting C++ unittests in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "libcppunit-1_15-1-1.15.1-1.14.aarch64.rpm"
RPM_HASH = "b50abb82869e91da4e972e2f1f8edd9a0d8619f65341f9a0ed4ef170dafe3544889b3a0dfa6b02bc9ac21ca7e9505c5a3f25977bbc57ac50154138e5ae6d6452"

RPROVIDES:${PN} += "libcppunit-1-15-1 \
libcppunit-1.15.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
