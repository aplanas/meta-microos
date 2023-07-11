SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-google-auth-httplib2-0.1.0-3.1.noarch.rpm"
RPM_HASH = "4023cc59ae90d3efec5811069245f828608ad22814d4a1ede8263fad2c066ee06efdc912e68a944cd39dc49d0940325eed17d834fbb01f205d6f2feffb26dfec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth-httplib2 \
python3.11dist-google-auth-httplib2 \
python311-google-auth-httplib2 \
python3dist-google-auth-httplib2"

RDEPENDS:${PN} += "python-abi \
python311-google-auth \
python311-httplib2 \
python311-six"

inherit rpm
