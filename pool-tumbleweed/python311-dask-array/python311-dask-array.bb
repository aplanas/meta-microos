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

RPM_NAME = "python311-dask-array-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "d6d17b27dbd44891187d9a15766e70e9267cbe99d850f23dfbbd182c492f5fb3ff837ce0d16494818d2d94dc0c2032bf25b747823611751a352ad43e23826e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-array \
python311-dask-array"

RDEPENDS:${PN} += "python-abi \
python311-dask \
python311-dask-delayed \
python311-numpy"

inherit rpm
