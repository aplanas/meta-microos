SUMMARY = "Tape drive control utility"
DESCRIPTION = "This package includes the 'mt', a local tape drive control program."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "cpio-mt-2.13-5.5.aarch64.rpm"
RPM_HASH = "0f329fd05151b0a7b80f3797ab1249f9e1d5f4df8f1dc3ff8d2bf431f0816d461556652a2bf0c8c622cce0e94efdf637d9ceb416f5cb9d9bad7e5abb482465f5"

RPROVIDES:${PN} += "cpio-mt \
mt"

RDEPENDS:${PN} += "/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
