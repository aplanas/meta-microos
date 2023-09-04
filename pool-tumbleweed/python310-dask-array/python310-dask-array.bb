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

RPM_NAME = "python310-dask-array-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "7cf5287edaf9dbfe3ad1ad5c40a662d85bbe22fb36c3999db28dd0f9ce4c3a8deec5bf633d151eb446f0eeb6d4076c40e4f5c08792d6ade92c9cd06215690dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-array"

RDEPENDS:${PN} += "python-abi \
python310-dask \
python310-dask-delayed \
python310-numpy"

inherit rpm
