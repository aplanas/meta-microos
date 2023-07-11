SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python310-pymediainfo-6.0.1-2.4.noarch.rpm"
RPM_HASH = "d410d06143c29c6fe8f3aca1adedf9c490383189e205568dabd6ce269e70eedb825cbdc2634c1dae659f522d6b9b8591670da585081aa0aadd934ffe047909d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymediainfo \
python310-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
