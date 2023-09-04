SUMMARY = "Indentation of Source Code in various styles"
DESCRIPTION = "Indent can be used to make code easier to read. It can also convert \
from one style of writing C code to another. indent understands a \
substantial amount of C syntax, but it also tries to cope with \
incomplete and malformed syntax."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-2.2.13-2.1.aarch64.rpm"
RPM_HASH = "fdf3e1439ca56434753f67810627c05e619d5243a23c4d4b0de569be53e2193e6c2f0c7d7baaaad166b60edf67d5997febe05b96f40b23060f9fe54981ddcb75"

RPROVIDES:${PN} += "indent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
