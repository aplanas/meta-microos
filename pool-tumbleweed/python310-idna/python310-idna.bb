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

RPM_NAME = "python310-idna-3.4-2.3.noarch.rpm"
RPM_HASH = "4fdecd17385bd07e7157bc82300e19e712bed0c3e2f6d1e728a5a33f564a48bcd6a8db527841df5a7965819156129d97ac50e38cb1589e93c9faf65a4c23d79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-idna \
python310-idna \
python3dist-idna"

RDEPENDS:${PN} += "python-abi"

inherit rpm
