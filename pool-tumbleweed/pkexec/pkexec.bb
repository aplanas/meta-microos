SUMMARY = "Pkexec component of polkit"
DESCRIPTION = "This package contains the pkexec setuid root binary part of polkit."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "pkexec-121-4.2.aarch64.rpm"
RPM_HASH = "e94de66f87cd8be4b2e97a4769ede684e0bad4d16b4d0d507db8ecd21b7aec9d8a03d5c8a6e394ed65ea1889dafeb10399ba8b0bf8b7050284082d3a796099b8"

RPROVIDES:${PN} += "pkexec \
pkexec(aarch-64) \
polkit:/usr/bin/pkexec"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
permissions \
polkit"

inherit rpm