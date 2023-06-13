SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python311-flickrapi-2.4.0-3.4.noarch.rpm"
RPM_HASH = "25bff7324e209fb8b9fc77e79481d82b86aaf938296eb96013365ed5e906831e1bf9ae23bbc19feeab24a7e62298f50bd4fea476eea2eb52f8ebcb1c2aeee8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flickrapi) \
python311-flickrapi \
python3dist(flickrapi)"

RDEPENDS:${PN} += "python(abi) \
python311-requests \
python311-requests-oauthlib \
python311-requests-toolbelt"

inherit rpm
