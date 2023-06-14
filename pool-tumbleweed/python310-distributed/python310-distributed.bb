SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-distributed-2023.3.2-2.1.noarch.rpm"
RPM_HASH = "195627fdd6cddf3a69c56f289c7188aae1249f92e02f43652bb8380a8240fa3b8fb3b9c9d8bd9aefa0ec80ac609083bcb344ab6b608dca1ff5c9a5cff0fc5333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distributed \
python3.10dist-distributed \
python310-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Jinja2 \
python310-PyYAML \
python310-click \
python310-cloudpickle \
python310-dask \
python310-locket \
python310-msgpack \
python310-packaging \
python310-psutil \
python310-sortedcontainers \
python310-tblib \
python310-toolz \
python310-tornado \
python310-urllib3 \
python310-zict \
update-alternatives"

inherit rpm
