SUMMARY = "A hex dump utility"
DESCRIPTION = "xxd creates a hex dump of a given file or standard input.  It can also convert \
a hex dump back to its original binary form."
LICENSE = "Vim"

PV = "9.0.1572"

RPM_NAME = "xxd-9.0.1572-1.1.aarch64.rpm"
RPM_HASH = "858c4eaf5096dc10f9fda8266fb40bc0d2fb9f8230c4ef656159674df1e1d7b62bd082322d511305e82791bf317e62e7a9d0f5065d83d5d848f27595b8723613"

RPROVIDES:${PN} += "xxd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
