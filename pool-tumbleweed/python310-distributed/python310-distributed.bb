SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-distributed-2023.5.1-1.3.noarch.rpm"
RPM_HASH = "74a7846e0e526d2b9056a7804188b15a29cb9f205be286fcbd27837a4311ce8489f17a80b5b607cc75b04cd80b9d1435f40a630e7b1732299284ebaaa6727bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-distributed \
python310-distributed \
python3dist-distributed"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
