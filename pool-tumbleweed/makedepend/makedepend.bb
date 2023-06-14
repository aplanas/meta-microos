SUMMARY = "Utility to create dependencies in makefiles"
DESCRIPTION = "The makedepend program reads each sourcefile in sequence and parses it \
like a C-preprocessor so that it can correctly tell which #include \
directives would be used in a compilation. \
 \
These dependencies are then written to a makefile in such a way that \
make will know which object files must be recompiled when a dependency \
has changed."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "makedepend-1.0.8-2.3.aarch64.rpm"
RPM_HASH = "d639d1fba75616055a499ac61174ce22822c328906c74d16b7a752b66245084be4aa9843eaaebb6e3d3e7bea4d721fc61097fa3aa55e64e2d38ad4b388adaab1"

RPROVIDES:${PN} += "makedepend"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
