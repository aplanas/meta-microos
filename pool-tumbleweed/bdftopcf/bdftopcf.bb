SUMMARY = "Font compiler for the X server and font server"
DESCRIPTION = "bdftopcf is a font compiler for the X server and font server. Fonts \
in Portable Compiled Format can be read by any architecture, although \
the file is structured to allow one particular architecture to read \
them directly without reformatting. This allows fast reading on the \
appropriate machine, but the files are still portable (but read more \
slowly) on other machines."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "bdftopcf-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "6d5aee2beb751e2cf4f3dd6a9f1e4e3cc5f047f203f38aceec30806d9086aaece78d2f9df30b1354dde168de17be2e8b532aa29bab6e88075cf8b4536c8f9bc7"

RPROVIDES:${PN} += "bdftopcf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
