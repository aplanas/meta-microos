SUMMARY = "Pkexec component of polkit"
DESCRIPTION = "This package contains the pkexec setuid root binary part of polkit."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "pkexec-121-4.2.aarch64.rpm"
RPM_HASH = "e94de66f87cd8be4b2e97a4769ede684e0bad4d16b4d0d507db8ecd21b7aec9d8a03d5c8a6e394ed65ea1889dafeb10399ba8b0bf8b7050284082d3a796099b8"

RPROVIDES:${PN} += "pkexec \
polkit-/usr/bin/pkexec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
permissions \
polkit"

inherit rpm
