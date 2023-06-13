SUMMARY = "Numpy-like array data structure for dask"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers. \
 \
This package contains the dask array class. \
 \
Dask arrays implement a subset of the NumPy interface on large \
arrays using blocked algorithms and task scheduling."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-dask-array-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "40a2a54a2b52b482fa242784bbdf93ad475e06ae1d086b7efd689a19db12e870500b51b74003087570800afa95e9bce489f2f5b41c1c54cf7fdeff7998562d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-array \
python310-dask-array"

RDEPENDS:${PN} += "python(abi) \
python310-dask \
python310-dask-delayed \
python310-numpy"

inherit rpm
