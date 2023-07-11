SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-distributed-2023.5.1-1.3.noarch.rpm"
RPM_HASH = "84dfdcd272de949d0473201369062c203094c6f51359269fa6564ba159a8dd2d74e5410469b8bc44b97aa12f20d52e6af34703e49b5723de4e5cdf5c0dcdb823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distributed \
python39-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-PyYAML \
python39-click \
python39-cloudpickle \
python39-dask \
python39-locket \
python39-msgpack \
python39-packaging \
python39-psutil \
python39-sortedcontainers \
python39-tblib \
python39-toolz \
python39-tornado \
python39-urllib3 \
python39-zict \
update-alternatives"

inherit rpm
