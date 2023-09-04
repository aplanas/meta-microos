SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-pymediainfo-6.0.1-3.1.noarch.rpm"
RPM_HASH = "18300b2356309e225fe4f6a336a3e816cc86b00b53faabe22edad7f012a3815f3ac4a90363d66805d587ef8bb549f1c19286539e3ea11e7cca0e5fbac2f437c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymediainfo \
python39-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
