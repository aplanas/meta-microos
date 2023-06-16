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

PV = "2023.3.2"

RPM_NAME = "python39-dask-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "385dc7517019620b5da14d75947827e63ae9d1ce9bd8d9296535c415c5bbe7c9bc693b2401a4b5de1335907c61704ad11791529758d46f737f799e83b6672248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dask \
python39-dask \
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
