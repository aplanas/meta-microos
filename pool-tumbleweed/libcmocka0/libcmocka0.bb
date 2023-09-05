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

RPM_NAME = "libcmocka0-1.1.7-3.1.aarch64.rpm"
RPM_HASH = "fd90a0b4cb83a32b44ac23fed74ea8ef0553b60ed6f23052d7d1f76b535c1b90cc80f994923510f761f36f9488e9eace38ea2898364dec899fae2e22c2946c76"

RPROVIDES:${PN} += "libcmocka.so.0 \
libcmocka0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
