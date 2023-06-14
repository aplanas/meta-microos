SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-go-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "43fc2fe71940454b50c66683d91e51cbc2705ed5390530273049910bb8fde53439c3f0ca54b7027c0a55a883378f836ce473ac3cec3523272c940af84c8bb84a"

RPROVIDES:${PN} += "gcc12-go"

RDEPENDS:${PN} += "gcc12 \
libc.so.6 \
libgmp.so.10 \
libgo.so.21 \
libgo21 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
