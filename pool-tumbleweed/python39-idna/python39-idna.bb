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

RPM_NAME = "python39-idna-3.4-2.1.noarch.rpm"
RPM_HASH = "f3f21a7ae1fbc411a82804f6231173e5031f6fb147e904ef43af4f18cd24fa42101acc7931cc70c652e071bec493bf0e2824738a8a29a33b15c7de1f4de9aa00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(idna) \
python39-idna \
python3dist(idna)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
