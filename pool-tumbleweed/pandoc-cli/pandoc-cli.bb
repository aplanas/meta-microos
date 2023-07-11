SUMMARY = "Conversion between documentation formats"
DESCRIPTION = "Pandoc-cli provides a command-line executable that uses the pandoc library to \
convert between markup formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "pandoc-cli-0.1.1-2.5.aarch64.rpm"
RPM_HASH = "e68c77705fce210fe2815bb3e32b31fcdd7ab776035c5f9250166f3e465129c7839cc1e5b843340db2e8abff8d57a00e0130ef3f805489c5a6328693a3e21ebf"

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
