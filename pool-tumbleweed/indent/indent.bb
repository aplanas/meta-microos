SUMMARY = "Indentation of Source Code in various styles"
DESCRIPTION = "Indent can be used to make code easier to read. It can also convert \
from one style of writing C code to another. indent understands a \
substantial amount of C syntax, but it also tries to cope with \
incomplete and malformed syntax."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-2.2.13-1.2.aarch64.rpm"
RPM_HASH = "5872216b9ca1a1559aed289e2d5b8740b64e4029f2f158b9f09050b26e1e1248b6155e822de28f1c028dd72e1cb424616016b133f711f5abe72962fb3f39428c"

RPROVIDES:${PN} += "indent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
