SUMMARY = "Multi-purpose finite-state toolkit"
DESCRIPTION = "Foma is a multi-purpose finite-state toolkit designed for \
applications ranging from natural language processing and research in \
automata theory. It should be upwardly compatible with Xerox xfst and \
lexc, with the exception of binary file reading and writing."
LICENSE = "GPL-2.0-only"

PV = "3.15.4"

RPM_NAME = "libfoma-hfst0-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "9d6f7170904adbae8ad4ba3337571e8a59120dc5fe7e0abc16570bc0d7e2158fd426a881bb6c475ae42741ae1a58ff721fdc9d92abf6f708d79cb06cb117b89e"

RPROVIDES:${PN} += "libfoma-hfst.so.0 \
libfoma-hfst0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpthread.so.0"

inherit rpm
