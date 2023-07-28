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

RPM_NAME = "python311-dask-array-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "aa6caab1354cca0c7b3acd201c9f0b1978ed1086a424f32884e258598904a16489c95ab8bcc9a74a16898a97155c54fbf8193965fdbfcb705dd4b2c012dc029c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-array \
python311-dask-array"

RDEPENDS:${PN} += "python-abi \
python311-dask \
python311-dask-delayed \
python311-numpy"

inherit rpm
