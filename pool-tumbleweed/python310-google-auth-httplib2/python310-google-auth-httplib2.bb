SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-google-auth-httplib2-0.1.0-2.5.noarch.rpm"
RPM_HASH = "df8a37b46a9cbdeb73dfc9634354c926f65cbdeb3b230ab1d4d0750993ad26660cc9893f3f29a802019a9b9451cdb918043d04e1ed18d55aaa62c86e28b46eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth-httplib2 \
python3.10dist(google-auth-httplib2) \
python310-google-auth-httplib2 \
python3dist(google-auth-httplib2)"

RDEPENDS:${PN} += "python(abi) \
python310-google-auth \
python310-httplib2 \
python310-six"

inherit rpm
