SUMMARY = "A Program to Extract InstallShield Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which is used by the \
InstallShield installer software. The unshield program simply unpacks \
such files. This is the binary executable."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "unshield-1.5.1-1.10.aarch64.rpm"
RPM_HASH = "780c4ec6d0278c9b00d9dc8840f2f801b7fd9c5eb987f0303c8d70d21e6eae87f972b5fc81f8361bca0221f41d2f9a5c26b23a8750e1f95ba744dd665215f6d3"

RPROVIDES:${PN} += "unshield"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libunshield.so.0"

inherit rpm
