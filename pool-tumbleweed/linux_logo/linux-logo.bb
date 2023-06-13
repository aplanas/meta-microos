SUMMARY = "Prints the linux logo on the text console"
DESCRIPTION = "The Linux logo on the text console, with colors and system information. \
Contains a number of built-in logos."
LICENSE = "GPL-2.0-only"

PV = "6.01"

RPM_NAME = "linux_logo-6.01-1.1.aarch64.rpm"
RPM_HASH = "34dd09cfd5dcc5e5393080115c1b63328b5812c2028850526717f7fcbc57fbee866cee11accf6937bb00d4355729d0dfa6a6f56cbcec7e37ce71161d7e369192"

RPROVIDES:${PN} += "linux_logo \
linux_logo(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
