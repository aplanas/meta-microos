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

RPM_NAME = "python310-requests-ftp-0.3.1-3.15.noarch.rpm"
RPM_HASH = "5e8e04c6056d374b04282a9a8d954714e2eeaa637dfdd9cfbb53ad5cdf61cfd3ffa0eb9d3e54d84258de5613e15e2a70010887d4ad2ed5b261d9b17f0ce05399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-ftp \
python3.10dist(requests-ftp) \
python310-requests-ftp \
python3dist(requests-ftp)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
