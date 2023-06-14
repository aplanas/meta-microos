SUMMARY = "Middleware for OpenStack Identity"
DESCRIPTION = "This package contains middleware modules designed to provide authentication \
and authorization features to web services other than Keystone \
The most prominent module is keystonemiddleware.auth_token. This package \
does not expose any CLI or Python API features. \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "10.2.0"

RPM_NAME = "python3-keystonemiddleware-10.2.0-1.2.noarch.rpm"
RPM_HASH = "4c36599e73bea4ea53f1fbb09d863a90a48308b27faca5101aaa3b6d742a7703d31a3d25ef2325c6bdf6e219648224f0ed0ecc8e7b381c9be1d108216d80b3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystonemiddleware \
python3.10dist-keystonemiddleware \
python3dist-keystonemiddleware"

RDEPENDS:${PN} += "python-abi \
python3-WebOb \
python3-keystoneauth1 \
python3-keystoneclient \
python3-oslo.cache \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.messaging \
python3-oslo.serialization \
python3-oslo.utils \
python3-pycadf \
python3-python-memcached \
python3-requests"

inherit rpm
