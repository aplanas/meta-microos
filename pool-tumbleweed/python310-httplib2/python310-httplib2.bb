SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.22.0"

RPM_NAME = "python310-httplib2-0.22.0-3.1.noarch.rpm"
RPM_HASH = "e500441c3e55af8428f150ddf5f974976d49394390dd37a02547235f4bd16655559abb406cb9afc4a8fb69f168671d4995c34a334815a6fd8dbfcb6cafb4975f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httplib2 \
python310-httplib2 \
python3dist-httplib2"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python310-certifi \
python310-pyparsing"

inherit rpm
