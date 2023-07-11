SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python311-ndg-httpsclient-0.5.1-3.14.noarch.rpm"
RPM_HASH = "7f05a571f6f3c11904c1ac6889f71104408b3ccbd736273243011746c9d4ff4e2f80fe35bc63198164325573008c08e2d0bc4c38177b89bd848adaf21bb8ea4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndg-httpsclient \
python3.11dist-ndg-httpsclient \
python311-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyOpenSSL \
python311-pyasn1 \
update-alternatives"

inherit rpm
