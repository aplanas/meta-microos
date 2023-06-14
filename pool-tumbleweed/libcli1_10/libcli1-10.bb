SUMMARY = "Cisco-like telnet command-line library"
DESCRIPTION = "libcli provides a shared library for including a Cisco-like command-line \
interface into other software. It's a telnet interface which supports \
command-line editing, history, authentication and callbacks for a \
user-definable function tree."
LICENSE = "LGPL-2.1-only"

PV = "1.10.7+git.20211009"

RPM_NAME = "libcli1_10-1.10.7+git.20211009-1.5.aarch64.rpm"
RPM_HASH = "b80c7e3a5e8356db7ee964f8d5555e3baefb81ef4bb612eabd448ef43645c02489846241a0e5b2881873667a4e6386c1886ca534df85c0c543aeece38d097891"

RPROVIDES:${PN} += "libcli.so.1.10 \
libcli1-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
