SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python310-flickrapi-2.4.0-3.6.noarch.rpm"
RPM_HASH = "02aab7975b4d8147cb5802009dc06ac3ce3388a1ef353cc57568abc8a3efa2b803cd881e7094313371a923aea41bfb9f0509f78322684ba4ddf0e2defb22c657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flickrapi \
python310-flickrapi \
python3dist-flickrapi"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-requests-oauthlib \
python310-requests-toolbelt"

inherit rpm
