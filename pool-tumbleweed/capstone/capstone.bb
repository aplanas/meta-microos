SUMMARY = "A multi-platform, multi-architecture disassembly framework"
DESCRIPTION = "Capstone is a disassembly framework. \
disasm engine for binary analysis and reversing in the security community."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "capstone-4.0.2-2.4.aarch64.rpm"
RPM_HASH = "dc0bfd72d0e7728686d68865cdec464753fcdec6a34e82d270dd40102fb45392ffd025ea07e9685bbb01269d83ec82ba798b650bcc76c0a17a9b6fff9b840ff6"

RPROVIDES:${PN} += "capstone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
