SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-hpack-4.0.0-2.3.noarch.rpm"
RPM_HASH = "d8a99ced6100867e1575160959fadc5da2b005f8892603aebbe8d842baea939204f63340dc498bcbc3949c38a4b565367c19f285150c7415f30e63e15b1f97de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hpack \
python39-hpack \
python3dist-hpack"

RDEPENDS:${PN} += "python-abi"

inherit rpm
