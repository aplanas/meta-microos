SUMMARY = "A hex dump utility"
DESCRIPTION = "xxd creates a hex dump of a given file or standard input.  It can also convert \
a hex dump back to its original binary form."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "xxd-9.0.1632-2.1.aarch64.rpm"
RPM_HASH = "5967319c8f7e7348a8f24927930aa69c3c1b503b4a8e820eff4eece72a56a59dadc7fe86f918b5d12c8f7f99885c162403e16127d2975e7f56f73c698518d807"

RPROVIDES:${PN} += "xxd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
