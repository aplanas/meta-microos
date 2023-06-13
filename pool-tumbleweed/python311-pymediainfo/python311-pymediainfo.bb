SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-pymediainfo-6.0.1-2.2.noarch.rpm"
RPM_HASH = "6c802045dd23b6988d3eb70f337047422544536ffd5964f345a7beb6da4df4c8f3976ecea9ad11ffee3349c5ff1ef2b00f03ab1b3cb24f55a601ecf6e8e3a82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pymediainfo) \
python311-pymediainfo \
python3dist(pymediainfo)"

RDEPENDS:${PN} += "libmediainfo0 \
python(abi)"

inherit rpm
