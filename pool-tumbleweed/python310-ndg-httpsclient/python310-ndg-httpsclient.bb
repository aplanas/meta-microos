SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python310-ndg-httpsclient-0.5.1-3.13.noarch.rpm"
RPM_HASH = "32cbb5051ab823992a4168f8e4bd0031b8e3f9d4829cbb78d0c81b7add16f8b76fcc1abed8c5d4c670e672fcf84df8661cecaabe20ffdc41bbe7809bcc1596fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndg-httpsclient \
python3.10dist-ndg-httpsclient \
python310-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-pyOpenSSL \
python310-pyasn1 \
update-alternatives"

inherit rpm
