SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-hpack-4.0.0-2.3.noarch.rpm"
RPM_HASH = "7702f706cc8cf6226c3c9a23fd60398318fb4bcc0050ba01dc1f3266ddf08b79f3603c0fee7a52e8fd427d68b161118ec71b61f0e181fc77294a86b29bbda439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hpack \
python310-hpack \
python3dist-hpack"

RDEPENDS:${PN} += "python-abi"

inherit rpm
