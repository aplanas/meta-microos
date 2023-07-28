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

RPM_NAME = "python39-dask-array-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "63a7cfe4559e0eb4577faec2dd59334232a7eb5ab72c77297738f708281a04a42cfed99ea3974c8df8cbe8c52a36a7ca379b7d3095a3b354a49ecc10257218be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-array"

RDEPENDS:${PN} += "python-abi \
python39-dask \
python39-dask-delayed \
python39-numpy"

inherit rpm
