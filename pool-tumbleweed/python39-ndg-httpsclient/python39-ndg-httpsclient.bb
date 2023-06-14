SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python39-ndg-httpsclient-0.5.1-3.13.noarch.rpm"
RPM_HASH = "b393c8689af03b9b701b9620087b883f4bf34fac73ffb764375005c9046b1a24788b1f053d0b79db49b7350cbb86286a208af20c5e448d22f685fcbd07c5df1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ndg-httpsclient \
python39-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-pyOpenSSL \
python39-pyasn1 \
update-alternatives"

inherit rpm
