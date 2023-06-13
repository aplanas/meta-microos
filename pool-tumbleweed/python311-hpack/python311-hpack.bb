SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-hpack-4.0.0-2.1.noarch.rpm"
RPM_HASH = "d95a3e5a619c04f22923bf6fc6a53f8ff6b8bfddd8dd61c13c4f28a31f295c8f934b8ed1449f967486ed3d6d2bb8d0544637d468cfca2fd659f455facc63f179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hpack) \
python311-hpack \
python3dist(hpack)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
