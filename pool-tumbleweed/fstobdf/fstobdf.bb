SUMMARY = "Program to read a font from an X font server"
DESCRIPTION = "The fstobdf program reads a font from a font server and prints a BDF \
file on the standard output that may be used to recreate the font. \
This is useful in testing servers, debugging font metrics, and \
reproducing lost BDF files."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "fstobdf-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "defe8fd3e97f312bf0f1c3b34e7d7782c5fadc1e0db6de6e3e1b31782a073fdde86f7e408889c2ea4aa5a43c6fe2f008de6472cdda7794d54af3ca5f988c83fa"

RPROVIDES:${PN} += "fstobdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFS.so.6 \
libX11.so.6 \
libc.so.6"

inherit rpm
