SUMMARY = "Minimal task scheduling abstraction"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-dask-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "45eb5a574cbee35a6edcd197bd3c23b9145b7674cd6801e57e226f321a5baf408710446f07e328c591aa65507d21f422310d5e730bb1f24cc12478a10bdbbbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dask \
python39-dask \
python39-dask-bag \
python39-dask-delayed \
python39-dask-dot \
python39-dask-multiprocessing \
python3dist-dask"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-click \
python39-cloudpickle \
python39-fsspec \
python39-importlib-metadata \
python39-packaging \
python39-partd \
python39-toolz \
update-alternatives"

inherit rpm
