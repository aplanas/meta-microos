SUMMARY = "Java package archiver"
DESCRIPTION = "Fastjar is an implementation of Sun's jar utility that comes with the \
JDK, written entirely in C, and runs in a fraction of the time while \
being 100% feature compatible."
LICENSE = "GPL-2.0-or-later"

PV = "0.98"

RPM_NAME = "fastjar-0.98-26.8.aarch64.rpm"
RPM_HASH = "b6c69592a4326eddfe82c698f2e8bd2fd1139006c4a9a89c4b637118296a3a546bad649434b5aaeb44e50bcb9dbb8d81f6c17f315c3cfaae831181512d2fd970"

RPROVIDES:${PN} += "fastjar \
fastjar(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
