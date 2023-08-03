SUMMARY = "Conversion between documentation formats"
DESCRIPTION = "Pandoc-cli provides a command-line executable that uses the pandoc library to \
convert between markup formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1.1"

RPM_NAME = "pandoc-cli-0.1.1.1-1.1.aarch64.rpm"
RPM_HASH = "c4f97493492290187866878c7d8ca03410bb4e3b895fd00e7bef398fcabc075700bc2c688d8da521252975403f95f2821bd34cf9f220680a41b12c49171bf8e4"

RPROVIDES:${PN} += "pandoc \
pandoc-cli"

RDEPENDS:${PN} += "ghc-pandoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
