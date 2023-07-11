SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-pymediainfo-6.0.1-2.4.noarch.rpm"
RPM_HASH = "df1b3540e33fb4a6faddc1253e86afe863470be68fd814c78d98376106289d87e921651b90e7386dd5e448f5364c8c5db0ed93903b8bf47504027dc1f05b22d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymediainfo \
python39-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
