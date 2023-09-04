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

PV = "2023.5.1"

RPM_NAME = "python39-dask-array-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "ed6928d478968f79e4117b3bcb5965200e219ba687f91023a83a2d75f4a7b92b46e66324f61f6309542636c0df0163fdadb0b2a4271ab835892ecbd133846c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-array"

RDEPENDS:${PN} += "python-abi \
python39-dask \
python39-dask-delayed \
python39-numpy"

inherit rpm
