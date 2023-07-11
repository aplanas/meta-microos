SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python39-flickrapi-2.4.0-3.6.noarch.rpm"
RPM_HASH = "5095df85d7a0a34b92b2a50fc6e17ee860cfee88eaa107ae3d09a5489f69827c4a7b266949a43b8a18293f76b598da1cb059fbcd9966e0ca39f1b67445e81ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flickrapi \
python39-flickrapi \
python3dist-flickrapi"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-requests-oauthlib \
python39-requests-toolbelt"

inherit rpm
