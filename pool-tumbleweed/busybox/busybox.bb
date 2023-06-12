SUMMARY = "Minimalist variant of UNIX utilities linked in a single executable"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable. It provides minimalist replacements for utilities \
usually found in fileutils, shellutils, findutils, textutils, grep, \
gzip, tar, and more. BusyBox provides a fairly complete POSIX \
environment for small or embedded systems. The utilities in BusyBox \
generally have fewer options than their GNU cousins. The options that \
are included provide the expected functionality and behave much like \
their GNU counterparts."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-1.36.0-1.3.aarch64.rpm"
RPM_HASH = "b7ba96e80ca74327f43145595f64029f200160b24d0f78f2a17e32dd2c700c15e6c5407b97bb7136d25d23de05f8572a64706c182f490f5b126d7795eb711132"

RPROVIDES:${PN} += "busybox \
busybox(aarch-64) \
config(busybox) \
useradd_or_adduser_dep"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsepol.so.2()(64bit) \
libsepol.so.2(LIBSEPOL_1.0)(64bit)"

inherit rpm
