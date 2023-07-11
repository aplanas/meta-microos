SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libatomic1-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "8c6f29740ab2bbd51260c14b89175ca4ba8659a845f8a1f720e5fd4353af9f4d7d31c29eaebf3e2d4ee99fe62b9adef1c93a96182eda00438c5fe79e9776c907"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1 \
libatomic1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
