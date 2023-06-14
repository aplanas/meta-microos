SUMMARY = "Support and cli utilities based on liblockfile"
DESCRIPTION = "This package contains support binaries for the liblockfile library, \
and the command-line utility 'dotlockfile'."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "lockfile-1.17-1.2.aarch64.rpm"
RPM_HASH = "614c95c8bd09282664dc27a9feced14244c72473a876e1f7bcf438cfefdc28235567496d30dd9a362d2e572b09791d33c5539c78edddf117b79dd19495b0a787"

RPROVIDES:${PN} += "lockfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
