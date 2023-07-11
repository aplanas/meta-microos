SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python311-pynetbox-7.0.1-1.5.noarch.rpm"
RPM_HASH = "ae9285d17f911a117a04388e44dfc6fd04f252c456cae459828de5fcd46300bffe41046fc46f9a4edc171d83866ec3ae81d48988f5c1789725c113d37eecf2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynetbox \
python3.11dist-pynetbox \
python311-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python311-netaddr \
python311-requests"

inherit rpm
