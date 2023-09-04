SUMMARY = "Real-time strategy gaming engine development files"
DESCRIPTION = "These are the development files for Wyrmsun which is based on the Stratagus engine."
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-devel-5.3.6-3.1.aarch64.rpm"
RPM_HASH = "c32cc1f249492b38c6524387511cd6af742bc1d9eca3b8cf6e672e2bcbaed60a912282f9e6a0272acbe22488cca5ce2a4ceb4b9128b5a8a81a66005387f7b460"

RPROVIDES:${PN} += "wyrmgus-devel"

RDEPENDS:${PN} += "wyrmgus"

inherit rpm
