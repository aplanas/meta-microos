SUMMARY = "FAudio Development Libraries"
DESCRIPTION = "FNA is a reimplementation of the Microsoft XNA Game Studio 4.0 Refresh libraries."
LICENSE = "Zlib"

PV = "23.03"

RPM_NAME = "FAudio-devel-23.03-1.4.aarch64.rpm"
RPM_HASH = "596ba9d34ed5e23959fc5419e38f8bf30d15ed89d183a956c59568c2b8237a5398e15fbccedb3dc4be3251287a668ff8e036e0dcf3126c0549f4edfae486fb68"

RPROVIDES:${PN} += "FAudio-devel \
cmake-FAudio \
pkgconfig-FAudio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFAudio0"

inherit rpm
