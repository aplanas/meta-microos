SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python39-ndg-httpsclient-0.5.1-3.14.noarch.rpm"
RPM_HASH = "88dcb036a2bd853638714e2162e7e214e05291b1445934379a7033946413a6234c2e574fbaebfb32628eeb301fd8d4d4d3376e50b3f472fc793b255be2afec3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ndg-httpsclient \
python39-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyOpenSSL \
python39-pyasn1 \
update-alternatives"

inherit rpm
