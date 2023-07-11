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

RPM_NAME = "python310-dask-array-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "b6ba4a2c0063a44175120f71062e71d749f1913426e4b5e606998ee2d62580f5764c0bef788074b8d8db2aa97d7ba0a907eeffe52d73dda1066c58fe88d13ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-array"

RDEPENDS:${PN} += "python-abi \
python310-dask \
python310-dask-delayed \
python310-numpy"

inherit rpm
