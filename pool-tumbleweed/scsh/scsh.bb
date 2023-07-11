SUMMARY = "A Unix shell embedded within Scheme"
DESCRIPTION = "Scsh is a Unix shell embedded in Scheme. It allows the user to write \
commands in a language within Scheme that follows the Unix way, but \
also allows to specify more complex commands with the elegance of \
Scheme."
LICENSE = "BSD-3-Clause"

PV = "0.7+git114432435e4eadd54334df6b37fcae505079b49f"

RPM_NAME = "scsh-0.7+git114432435e4eadd54334df6b37fcae505079b49f-7.5.aarch64.rpm"
RPM_HASH = "36763a84586f7be6cedfcaa8aa96f5304405444fdb8671e634acc2e6ef4da0b4124cd24b21edeba1dc78e6db5b1a24251988502d68e9ffbf6b26d1eac9ae9ffd"

RPROVIDES:${PN} += "scsh"

RDEPENDS:${PN} += "libc.so.6 \
scheme48-vm \
scsh-base"

inherit rpm
