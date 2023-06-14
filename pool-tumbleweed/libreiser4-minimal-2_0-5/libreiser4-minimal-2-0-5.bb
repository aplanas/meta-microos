SUMMARY = "Minimal version of the Reiser4 filesystem library"
DESCRIPTION = "libreiser4-minimal is a variant of the Reiser4 filesystem library \
that uses a reduced footprint and which has certain features disabled \
(plugin check, FNV1 hash, Rupasov hash, TEA hash and DEG hash). The \
maximum supported path length in -minimal is 256 instead of 1024."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "libreiser4-minimal-2_0-5-2.0.5-1.7.aarch64.rpm"
RPM_HASH = "0b292183f7c2e3ba6160d37339cebbf6948a7f4da419f057ea4e71360666056334cf6990810d053dfc5607a75d858617e49039bc3eaea695cf783eefe186dcc9"

RPROVIDES:${PN} += "libreiser4-minimal-2-0-5 \
libreiser4-minimal-2.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreadline.so.8 \
libuuid.so.1"

inherit rpm
