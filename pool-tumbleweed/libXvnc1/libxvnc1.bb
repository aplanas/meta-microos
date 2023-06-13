SUMMARY = "X extension to control VNC module"
DESCRIPTION = "Xvnc extension allows X clients to read and change VNC configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "libXvnc1-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "5f48ef300a80633991161259298cd204f4e38a9a4a8107b53d4a3f95ed0f6cf5f422f3db3234def2a2f4cdff5d0e08f1fe451233fb36076d0be0b81f5cbabffa"

RPROVIDES:${PN} += "libXvnc.so.1()(64bit) \
libXvnc1 \
libXvnc1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
