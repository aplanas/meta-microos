SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-google-auth-httplib2-0.1.0-3.1.noarch.rpm"
RPM_HASH = "75177a39e8a0350e33a4c6711f9024799241cc55ef92f8f67c3f38f799f2908fd9379ec70696e85a08f07677d1059396f059c879c6059bfe3b42f1322f3916ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-auth-httplib2 \
python310-google-auth-httplib2 \
python3dist-google-auth-httplib2"

RDEPENDS:${PN} += "python-abi \
python310-google-auth \
python310-httplib2 \
python310-six"

inherit rpm
