SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python310-ndg-httpsclient-0.5.1-3.14.noarch.rpm"
RPM_HASH = "232c247dd501916e33a637b989d946d4699865f782b84e13cadf96d949fe3fa0bc084d8024153e41ca77b2758b19b96df1bd3246cd43b650b2bcfde3b4f39f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ndg-httpsclient \
python310-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyOpenSSL \
python310-pyasn1 \
update-alternatives"

inherit rpm
