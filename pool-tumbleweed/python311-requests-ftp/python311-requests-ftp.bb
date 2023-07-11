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

RPM_NAME = "python311-requests-ftp-0.3.1-3.16.noarch.rpm"
RPM_HASH = "a9229e9ae9ec5e57736d862cf7a2db9cb7d787dba957000de8e1e042b128afba12e9cb9b912f4db88518f478c96f3ebd318ed280b97477525b08f74c19a4bf64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-ftp \
python3.11dist-requests-ftp \
python311-requests-ftp \
python3dist-requests-ftp"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
