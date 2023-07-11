SUMMARY = "Quake III"
DESCRIPTION = "Quake III first person shooter. This package only includes the binary \
files, you still need the data files from the original Quake III CD or \
the Demo."
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20221123"

RPM_NAME = "ioquake3-1.36+git.20221123-1.4.aarch64.rpm"
RPM_HASH = "a4534955534d6d0f53f838e2a8334f6b91926a525e9725a39db521d891e81501930d909c0b3677dc78fcf5ff3cf3113e81c80b8686408db07cf9f09f13ff9e1f"

RPROVIDES:${PN} += "ioquake3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
