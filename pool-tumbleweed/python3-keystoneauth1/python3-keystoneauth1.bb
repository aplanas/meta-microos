SUMMARY = "OpenStack authenticating tools"
DESCRIPTION = "Tools for authenticating to an OpenStack-based cloud. These tools include: \
* Authentication plugins (password, token, and federation based) \
* Discovery mechanisms to determine API version support \
* A session that is used to maintain client settings across requests \
  (based on the requests Python library) \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python3-keystoneauth1-5.2.1-1.1.noarch.rpm"
RPM_HASH = "54eab4b030d008100d37b07750ecfdf5717ead840a49b79445c22cdbd5286822766f81bda8d78a828cb37ff1ad8a630290bd0701f0c8ea48d02890a80acd73fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneauth1 \
python3.11dist-keystoneauth1 \
python3dist-keystoneauth1"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-iso8601 \
python3-lxml \
python3-oauthlib \
python3-os-service-types \
python3-requests \
python3-requests-kerberos \
python3-stevedore"

inherit rpm
