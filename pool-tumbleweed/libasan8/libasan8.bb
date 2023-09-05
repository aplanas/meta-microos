SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libasan8-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "de07b609d32ef12a59f4389789970406dc68fa20b7d9c503cffac3a819fa2ec83cc0b93aec2dffcaa91d4befe17ae664dcccb2cc29e0b0f99a150e50ed3755ce"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
