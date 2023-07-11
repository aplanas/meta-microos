SUMMARY = "FTP Transport Adapter for Requests"
DESCRIPTION = "Requests-FTP is an implementation of a very stupid FTP transport adapter for \
use with the `Requests` Python library. \
 \
This library is *not* intended to be an example of Transport Adapters best \
practices. This library was cowboyed together in about 4 hours of total work, \
has no tests, and relies on a few ugly hacks. Instead, it is intended as both \
a starting point for future development and an example for how to \
implement transport adapters."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python310-requests-ftp-0.3.1-3.16.noarch.rpm"
RPM_HASH = "0bbcfcf66f702d9bad4abbd60a54989da3e693b6f334d7da3c8b0236750ace17db0ffe55857cc31ca4523dbc821d9978634c9fb0b7e9f687ab17eac8789cd790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-ftp \
python310-requests-ftp \
python3dist-requests-ftp"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
