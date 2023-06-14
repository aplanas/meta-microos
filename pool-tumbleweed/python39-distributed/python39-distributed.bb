SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python39-distributed-2023.3.2-2.1.noarch.rpm"
RPM_HASH = "6efb1c9e16e6d2022b920226ccec4b49cc3e1b4d6ab9e6b3c4b5ebf764546aebbbb550f67cb9c1330ea40918c32a119392d4db4fb63bf304ff29ff88950d686f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distributed \
python39-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
