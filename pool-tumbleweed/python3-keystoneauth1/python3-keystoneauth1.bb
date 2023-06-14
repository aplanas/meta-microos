SUMMARY = "OpenStack authenticating tools"
DESCRIPTION = "Tools for authenticating to an OpenStack-based cloud. These tools include: \
* Authentication plugins (password, token, and federation based) \
* Discovery mechanisms to determine API version support \
* A session that is used to maintain client settings across requests \
  (based on the requests Python library) \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.1.2"

RPM_NAME = "python3-keystoneauth1-5.1.2-1.2.noarch.rpm"
RPM_HASH = "7c075c5d29f0d124d35a21d3f7b770d7463bf41ede739ffa12d8b09c9d7961e8f35ac88e959414409f66db2649f152ef4913297892caf56f72ab0c58deb21ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneauth1 \
python3.10dist-keystoneauth1 \
python3dist-keystoneauth1"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-iso8601 \
python3-lxml \
python3-oauthlib \
python3-os-service-types \
python3-requests \
python3-requests-kerberos \
python3-six \
python3-stevedore"

inherit rpm
