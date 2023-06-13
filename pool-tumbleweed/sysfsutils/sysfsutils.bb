SUMMARY = "System Utilities Package / Libsysfs"
DESCRIPTION = "This package's purpose is to provide a library for interfacing with the \
kernel's sys filesystem mounted at /sys. The library was an attempt to \
create a stable interface to sysfs, but it failed. It is still provided \
for the current users, but no new software should use this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "sysfsutils-2.1.1-1.8.aarch64.rpm"
RPM_HASH = "4dc2cf7de5c25006495ba99bf35d140a8f0fef36524f1f301793b85e72e25b478b786fe987e5aaf49e441ff318b79c71bfa56ea207f23e242f6b9f7b7f3d00a7"

RPROVIDES:${PN} += "libsysfs \
sysfsutils \
sysfsutils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsysfs.so.2()(64bit)"

inherit rpm
