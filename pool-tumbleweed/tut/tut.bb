SUMMARY = "A TUI for Mastodon with vim inspired keys"
DESCRIPTION = "tut is a TUI for Mastodon with vim inspired keys. TUI is an acronym for text-based user interface, so tut runs in your terminal."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "tut-2.0.1-1.3.aarch64.rpm"
RPM_HASH = "ec822f262b20c18ca5ad534076fdd7fa1b2d1f03b9c0923c3efe4cb7226c041efec3c293944b5bdb918044ca2013e942ef1293600c6013f7e9fe9a01b1bd7934"

RPROVIDES:${PN} += "tut"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
