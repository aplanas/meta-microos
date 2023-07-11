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

RPM_NAME = "python311-idna-3.4-2.3.noarch.rpm"
RPM_HASH = "9f27b1b0c3b81338dbee9e13983fd1ad547ee429a9e2f8bea32e37a416d5f9b4e25e6ee8963ec60610e547c459ecf02d98673533f399c3dd6d1a50d11941352a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-idna \
python3.11dist-idna \
python311-idna \
python3dist-idna"

RDEPENDS:${PN} += "python-abi"

inherit rpm
