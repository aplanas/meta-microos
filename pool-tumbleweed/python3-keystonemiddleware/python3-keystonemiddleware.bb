SUMMARY = "Middleware for OpenStack Identity"
DESCRIPTION = "This package contains middleware modules designed to provide authentication \
and authorization features to web services other than Keystone \
The most prominent module is keystonemiddleware.auth_token. This package \
does not expose any CLI or Python API features. \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "10.4.0"

RPM_NAME = "python3-keystonemiddleware-10.4.0-1.1.noarch.rpm"
RPM_HASH = "ba4435ec7b8bd60054544ce3af89aca830ac8bc707572c626c754d0abdd5e201cecc62d23fb76625e0a007b5c1765e2823243737368881f77caf5dbd186d96ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystonemiddleware \
python3.11dist-keystonemiddleware \
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
