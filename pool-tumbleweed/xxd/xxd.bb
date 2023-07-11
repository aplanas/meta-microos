SUMMARY = "A hex dump utility"
DESCRIPTION = "xxd creates a hex dump of a given file or standard input.  It can also convert \
a hex dump back to its original binary form."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "xxd-9.0.1632-1.1.aarch64.rpm"
RPM_HASH = "86152cdd2872927e3b289b88ce9e1702652eb88dfb934d4b41e98ddd6238d9709eb65ce20265d54edc3f446f6a55e4da7a52434510a2b277ae41ba9c97ea5a82"

RPROVIDES:${PN} += "xxd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
