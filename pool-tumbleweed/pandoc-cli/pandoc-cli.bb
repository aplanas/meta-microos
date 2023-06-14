SUMMARY = "Conversion between documentation formats"
DESCRIPTION = "Pandoc-cli provides a command-line executable that uses the pandoc library to \
convert between markup formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "pandoc-cli-0.1.1-2.2.aarch64.rpm"
RPM_HASH = "da403e5235f878752951e9742bf51c59235f98c628dba63951eaa4a54bac39eb1f68afbde276b2aca51885dc90714fc40957abef5c79e2bcd62d5b8e5fd4285a"

RPROVIDES:${PN} += "pandoc \
pandoc-cli"

RDEPENDS:${PN} += "ghc-pandoc \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
