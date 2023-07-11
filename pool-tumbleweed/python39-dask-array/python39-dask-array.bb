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

RPM_NAME = "python39-dask-array-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "4cf728946b7744ea03c3df4fb917c32d08add3dce221ef71f377f8e757bdb67ab9b9f98a4eba91383a02ee82d40ae259f6661414667affbb5d489f3be99f10a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-array"

RDEPENDS:${PN} += "python-abi \
python39-dask \
python39-dask-delayed \
python39-numpy"

inherit rpm
