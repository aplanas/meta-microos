SUMMARY = "Dynamic runtime library for Ruby"
DESCRIPTION = "Dynamic runtime library for Ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "libruby3_2-3_2-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "312c77f614835be7dfa2b2a1bc1df39567aa8f794c2b31320b98f81fbfb2be960b881c6675cd6b8503c489c45285cf7b13da4a009444f81d697456ebd805a8a9"

RPROVIDES:${PN} += "libruby3-2-3-2 \
libruby3.2.so.3.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
