SUMMARY = "Conversion between documentation formats"
DESCRIPTION = "Pandoc-cli provides a command-line executable that uses the pandoc library to \
convert between markup formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1.1"

RPM_NAME = "pandoc-cli-0.1.1.1-1.3.aarch64.rpm"
RPM_HASH = "533f9e6bb7276cf396b56395e6f97fc4856f47bf13ac43cd902f30a243ae99f29baf91f48cd11e942f2ec2c91d0dca9ce7669a434b5196cae26017510a2113cc"

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
