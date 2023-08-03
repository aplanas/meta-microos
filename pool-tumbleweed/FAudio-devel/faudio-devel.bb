SUMMARY = "FAudio Development Libraries"
DESCRIPTION = "FNA is a reimplementation of the Microsoft XNA Game Studio 4.0 Refresh libraries."
LICENSE = "Zlib"

PV = "23.07"

RPM_NAME = "FAudio-devel-23.07-1.1.aarch64.rpm"
RPM_HASH = "6bc2b9eade32d905f370c328dd6a2da8002a69b9ffe6b03f8ce71b9574cdc756d56332ecde594ceeb0ceb54fef8174087c114d950ddb910faaf8d8ff440ae339"

RPROVIDES:${PN} += "FAudio-devel \
cmake-FAudio \
pkgconfig-FAudio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFAudio0"

inherit rpm
