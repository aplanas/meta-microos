SUMMARY = "A hex dump utility"
DESCRIPTION = "xxd creates a hex dump of a given file or standard input.  It can also convert \
a hex dump back to its original binary form."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "xxd-9.0.1632-2.2.aarch64.rpm"
RPM_HASH = "e11665877a1202657a394652d1244d9b0d69ce9f4b2259aac5e2016f86bd6e72e5871c2364ee1ef24cb35162776520270f72b6de19ac64402fca582b61f67e42"

RPROVIDES:${PN} += "xxd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
