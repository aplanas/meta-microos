SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.23"

RPM_NAME = "python310-dnslib-0.9.23-1.4.noarch.rpm"
RPM_HASH = "b7b7ff928fb922f1902c99be5d5e911fa8629db830f4cfbe438d0c6943cdad8d0d041a9d40ee4edf850f31f4f039e19e0401b36fede5ad6228be1b13be66658d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dnslib \
python310-dnslib \
python3dist-dnslib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
