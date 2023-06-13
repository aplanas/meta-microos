SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-google-auth-httplib2-0.1.0-2.5.noarch.rpm"
RPM_HASH = "5d2302fc96f83af3a06297809bea77a33bc5176df8a0f059c0ab62498464913bd3a7121222499e50a7e12ee5aff1169da43dca61af63dd56fd94e571d795c74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-auth-httplib2) \
python311-google-auth-httplib2 \
python3dist(google-auth-httplib2)"

RDEPENDS:${PN} += "python(abi) \
python311-google-auth \
python311-httplib2 \
python311-six"

inherit rpm
