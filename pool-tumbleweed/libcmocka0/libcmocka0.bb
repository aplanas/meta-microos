SUMMARY = "Lightweight library to simplify and generalize unit tests for C"
DESCRIPTION = "cmocka is an elegant unit testing framework for C with support for mock \
objects. It only requires the standard C library, works on a range of computing \
platforms (including embedded) and with different compilers. \
 \
Features: \
  * Support for mock objects \
  * Only requires the C library \
  * Several supported output formats (Subunit, TAP, jUnit XML) \
  * Fully documented API \
  * Test fixtures \
  * Exception handling for signals (SIGSEGV, SIGILL, ...) \
  * No fork() used \
  * Very well tested \
  * Testing of memory leaks, buffer overflows and underflows. \
 \
Also, CMocka tries to avoid the use of some of the newer features of C \
compilers."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "libcmocka0-1.1.7-2.1.aarch64.rpm"
RPM_HASH = "ce3e934f29173da399a54d6f304adb9e78a0f0c2eb48e8ac9f6401c0c1fa59bab71bd5ef1a69af72551a6b81f60fb516c36d9c2e9fe5f1b5d014f71af5f6661e"

RPROVIDES:${PN} += "libcmocka.so.0()(64bit) \
libcmocka0 \
libcmocka0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
