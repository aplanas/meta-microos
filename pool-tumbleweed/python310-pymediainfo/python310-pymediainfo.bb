SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python310-pymediainfo-6.0.1-2.2.noarch.rpm"
RPM_HASH = "3b38bf1ce0deca71bced648ab40572a0ef08387e27d3cc40fc9577133a6c054a8f8683cce0904937cba4091ef4c997b14e215a5bafc88364b94770c5be1c4883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymediainfo \
python3.10dist(pymediainfo) \
python310-pymediainfo \
python3dist(pymediainfo)"
RDEPENDS:${PN} += "libmediainfo0 \
python(abi)"

inherit rpm
