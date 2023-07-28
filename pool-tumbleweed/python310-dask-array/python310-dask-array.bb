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

RPM_NAME = "python310-dask-array-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "25fd50b9776b4a92ec575512bd40ea69249860de4a2b359d3d69e4034d4d3d56aa8e020a8512613a2c176e05d4a1440faaba3b166cc322366018ec86b58bbf1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-array"

RDEPENDS:${PN} += "python-abi \
python310-dask \
python310-dask-delayed \
python310-numpy"

inherit rpm
