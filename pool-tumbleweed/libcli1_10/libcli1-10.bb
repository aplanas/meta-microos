SUMMARY = "Cisco-like telnet command-line library"
DESCRIPTION = "libcli provides a shared library for including a Cisco-like command-line \
interface into other software. It's a telnet interface which supports \
command-line editing, history, authentication and callbacks for a \
user-definable function tree."
LICENSE = "LGPL-2.1-only"

PV = "1.10.7+git.20211009"

RPM_NAME = "libcli1_10-1.10.7+git.20211009-1.6.aarch64.rpm"
RPM_HASH = "7747633157dab14c11e77a59d1a76780a87101d432a54d0d111ae01675e4a442c2b9d738dec2b662194f02ebf35996e528332f04ef3defac1a50e7fdd439d8a7"

RPROVIDES:${PN} += "libcli.so.1.10 \
libcli1-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
