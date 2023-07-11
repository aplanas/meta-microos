SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python311-flickrapi-2.4.0-3.6.noarch.rpm"
RPM_HASH = "b30b843c553f0f888b1244fdacb5a53561b10211054f01e4416e8c53141c8997ba8aff6ae4ae02ac473b3dfbf66a642820d2ef231375a5e28f7eac064ea36903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flickrapi \
python3.11dist-flickrapi \
python311-flickrapi \
python3dist-flickrapi"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-requests-oauthlib \
python311-requests-toolbelt"

inherit rpm
