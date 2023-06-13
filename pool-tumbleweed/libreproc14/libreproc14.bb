SUMMARY = "Shared library for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the shared library for reproc."
LICENSE = "MIT"

PV = "14.2.4"

RPM_NAME = "libreproc14-14.2.4-3.1.aarch64.rpm"
RPM_HASH = "c58e3e4e94720bba3dc69af21b7fbc4b00abbf016811ab233e3b226e8bcff770f7443afe08c83f0701a7af46295530242660d7b2240b1e2fd28fb591f7136a01"

RPROVIDES:${PN} += "libreproc.so.14()(64bit) \
libreproc14 \
libreproc14(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
