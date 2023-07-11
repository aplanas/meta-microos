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

RPM_NAME = "makedepend-1.0.8-2.4.aarch64.rpm"
RPM_HASH = "1ffc3bd70a1d3df8bd8c0cd6646b004abe3fd909358777439e81b735d4f61b0babe9a822409d4f0e0a60a8874da5a3f017da475a24e8b4482d3a15069440ab6d"

RPROVIDES:${PN} += "makedepend"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
