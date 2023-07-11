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

RPM_NAME = "python39-requests-ftp-0.3.1-3.16.noarch.rpm"
RPM_HASH = "2780e45e6800152873e70e22926d088ba64da6df3227754104e93ecd39a1f39144d95d41830a29436579db7fa09717e73368fa782a34bd991922fc9110317f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-ftp \
python39-requests-ftp \
python3dist-requests-ftp"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
