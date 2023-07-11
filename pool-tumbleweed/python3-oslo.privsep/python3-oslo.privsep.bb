SUMMARY = "OpenStack library for privilege separation"
DESCRIPTION = "OpenStack library for privilege separation"
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python3-oslo.privsep-3.0.1-1.4.noarch.rpm"
RPM_HASH = "0daaa6fa91e7265b9005fdd270c2270ee5f9c33d57229c9861c25e2414c3ba4fec55b70fce1e5f39c611e5f14560756da969fdb00e2916e2fd5b66609981c89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.privsep \
python3.11dist-oslo.privsep \
python3dist-oslo.privsep"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cffi \
python3-eventlet \
python3-greenlet \
python3-msgpack \
python3-oslo.config \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.utils"

inherit rpm
