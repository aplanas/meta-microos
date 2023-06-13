SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python310-flickrapi-2.4.0-3.4.noarch.rpm"
RPM_HASH = "4b22bafe3bf884fd3d3bab62ef0775c116d02a87044bc5db2511b10748e3252d1b2398a01011a1b85343925e7045c5b71b32986e55796facfedd341a3acd5848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flickrapi \
python3.10dist(flickrapi) \
python310-flickrapi \
python3dist(flickrapi)"

RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-requests-oauthlib \
python310-requests-toolbelt"

inherit rpm
