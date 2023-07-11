SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-dmg-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "58ea9391dbc27f37d06b697db7a5ca79038253bf9282668dc272280bcb53d7ce2945cfd3629d72d4d0c312a2a3413815f397a15841a72e6dbd39bfe018b782c9"

RPROVIDES:${PN} += "qemu-block-dmg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzfse.so"

inherit rpm
