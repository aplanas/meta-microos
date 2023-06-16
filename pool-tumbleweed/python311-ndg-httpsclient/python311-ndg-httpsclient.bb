SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python311-ndg-httpsclient-0.5.1-3.13.noarch.rpm"
RPM_HASH = "6db87d5dc81d931c2495a5b2020d6242d7db0cf0a995f3d292691c49ec022b9bb499e64b9afde135fdc0fa62abd4e75e572a11ce758aae37172d329579940ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ndg-httpsclient \
python311-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyOpenSSL \
python311-pyasn1 \
update-alternatives"

inherit rpm
