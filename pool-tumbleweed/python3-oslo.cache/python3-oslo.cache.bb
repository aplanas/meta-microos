SUMMARY = "Cache storage for Openstack projects"
DESCRIPTION = "oslo.cache aims to provide a generic caching mechanism for OpenStack projects \
by wrapping the dogpile.cache library. The dogpile.cache library provides \
support memoization, key value storage and interfaces to common caching \
backends such as Memcached."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "python3-oslo.cache-3.4.0-1.1.noarch.rpm"
RPM_HASH = "8f69ee638fc8b050db7d8c844200d8af363ff7c08d9b26433ac47d9c2f4a4b08c43ebc4362eb79e19c8198dc480bb893dcc41dd759cac77d322f982e8306e344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.cache \
python3.11dist-oslo.cache \
python3dist-oslo.cache"

RDEPENDS:${PN} += "python-abi \
python3-dogpile.cache \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.utils \
python3-python-memcached"

inherit rpm
