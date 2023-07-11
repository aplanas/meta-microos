SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
DESCRIPTION = "A library to support the Internationalised Domain Names in \
Applications (IDNA) protocol as specified in RFC 5891 \
http://tools.ietf.org/html/rfc5891. This version of the protocol \
is often referred to as “IDNA2008” and can produce different \
results from the earlier standard from 2003. \
 \
The library is also intended to act as a suitable drop-in replacement \
for the “encodings.idna” module that comes with the Python standard \
library but currently only supports the older 2003 specification."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "python39-idna-3.4-2.3.noarch.rpm"
RPM_HASH = "a9c79f18957fbd0df1d92d32229af62ca0df80e81a55a37d2e72c6487c73b26849fb518d4d22dca83129dfda0c62c03c3683d5bc4993d8cfb91e7c376d5538c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-idna \
python39-idna \
python3dist-idna"

RDEPENDS:${PN} += "python-abi"

inherit rpm
