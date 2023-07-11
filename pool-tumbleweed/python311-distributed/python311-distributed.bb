SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python311-distributed-2023.5.1-1.3.noarch.rpm"
RPM_HASH = "9cc046a60f2a33adf8bca996ab536c5895cb4f7d8621dbdf77c42c8a4cf599ceca7859e60ae07f560c505dbffb9128b156c4e89245ad801085357e5a32dd8efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distributed \
python3.11dist-distributed \
python311-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-PyYAML \
python311-click \
python311-cloudpickle \
python311-dask \
python311-locket \
python311-msgpack \
python311-packaging \
python311-psutil \
python311-sortedcontainers \
python311-tblib \
python311-toolz \
python311-tornado \
python311-urllib3 \
python311-zict \
update-alternatives"

inherit rpm
