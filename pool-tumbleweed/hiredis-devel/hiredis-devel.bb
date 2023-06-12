SUMMARY = "Header files and libraries for hiredis"
DESCRIPTION = "The hiredis-devel package contains the header files and \
libraries for Redis database."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "hiredis-devel-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "f9aedbfc73855ea547e33b5204f0ca21904db89f9a3b10ec53efff34cd08f2fa30a0474ae0d3c51c8a152b16897b5e5fffbb0d909c396a3a1009a1aee5d7844f"

RPROVIDES:${PN} += "hiredis-devel \
hiredis-devel(aarch-64) \
pkgconfig(hiredis) \
pkgconfig(hiredis_ssl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhiredis1_1_0 \
pkgconfig(hiredis)"

inherit rpm
