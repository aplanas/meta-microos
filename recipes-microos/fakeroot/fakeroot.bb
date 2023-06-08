SUMMARY = "Wrapper that gives a fake root environment"
DESCRIPTION = "fakeroot runs a command in an environment wherein it appears to have \
root privileges for file manipulation. fakeroot works by replacing the \
file manipulation library functions (chmod(2), stat(2) etc.) by ones \
that simulate the effect the real library functions would have had, \
had the user really been root."
LICENSE = "GPL-3.0-or-later"

PV = "1.29"

RPM_NAME = "fakeroot-1.29-2.2.aarch64.rpm"
RPM_HASH = "37c21fdaedcf297e1695813d90c3c296ee78aa32f280b8df5fe619a7a05f1c4e5260c792b9beade225e2c33d13a5f30cd8a7487ace0ca9386bda1dee54f0c5d2"

RPROVIDES:${PN} += "fakeroot fakeroot(aarch-64) libfakeroot-0.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) update-alternatives"

inherit rpm
