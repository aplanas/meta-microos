SUMMARY = "Minimal version of the Reiser4 filesystem library"
DESCRIPTION = "libreiser4-minimal is a variant of the Reiser4 filesystem library \
that uses a reduced footprint and which has certain features disabled \
(plugin check, FNV1 hash, Rupasov hash, TEA hash and DEG hash). The \
maximum supported path length in -minimal is 256 instead of 1024."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "libreiser4-minimal-2_0-5-2.0.5-1.8.aarch64.rpm"
RPM_HASH = "cecc672bc63ee9d3c3f7af9eb232269aad43a09293c20335e102e0c6ad78e7ceb8b224182fbc2a9f8ab27dbfd7c877d288ff5d2543377c8521fabac8e01fd1de"

RPROVIDES:${PN} += "libreiser4-minimal-2-0-5 \
libreiser4-minimal-2.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreadline.so.8 \
libuuid.so.1"

inherit rpm
