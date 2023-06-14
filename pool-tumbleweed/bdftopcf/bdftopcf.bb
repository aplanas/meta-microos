SUMMARY = "Font compiler for the X server and font server"
DESCRIPTION = "bdftopcf is a font compiler for the X server and font server. Fonts \
in Portable Compiled Format can be read by any architecture, although \
the file is structured to allow one particular architecture to read \
them directly without reformatting. This allows fast reading on the \
appropriate machine, but the files are still portable (but read more \
slowly) on other machines."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "bdftopcf-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "d042a72d806e8018259736bcbf8477c014b7e97f69cfe41703d9ebac7ab1f2f018811c34f84fbbbfe1f389e8702d6315d14bfa384d7b460c9458c0d15be5fc9e"

RPROVIDES:${PN} += "bdftopcf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
