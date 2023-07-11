SUMMARY = "Development files for tecla, an interactive command line editing library"
DESCRIPTION = "The tecla library provides programs with interactive command line \
editing facilities, similar to those of the tcsh shell."
LICENSE = "X11"

PV = "1.6.3"

RPM_NAME = "tecla-devel-1.6.3-3.16.aarch64.rpm"
RPM_HASH = "328d51d4e7723c3420f4b0963d3bd5a89a49e7b60f8a8949b7f9a6fdba3a8ccaaaffcc16c21d6a9d66269b50e5fd358808663c862c73937dd7793042b75eb4f0"

RPROVIDES:${PN} += "tecla-devel"

RDEPENDS:${PN} += "libtecla-r1"

inherit rpm
