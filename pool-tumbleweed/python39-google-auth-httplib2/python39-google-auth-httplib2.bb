SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-google-auth-httplib2-0.1.0-3.1.noarch.rpm"
RPM_HASH = "884c686b01c00285d3a0630ccaad28a95d53ea00be2f5d32e48a53597a8e76dbe7249b1388caaa16df755acc1c10aa9874f791d2d4aa4d21672ff90d6b2488eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-auth-httplib2 \
python39-google-auth-httplib2 \
python3dist-google-auth-httplib2"

RDEPENDS:${PN} += "python-abi \
python39-google-auth \
python39-httplib2 \
python39-six"

inherit rpm
