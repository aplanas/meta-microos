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

RPM_NAME = "python311-dask-array-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "b0ca88223d44dec29bfe7d95f5074557f2ba7e6413cfd896b9ca3066783b628ad6fa75d957ad44dcb8e85300ae2772211d4091ce805e4618de1ce252605ad185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-array \
python311-dask-array"

RDEPENDS:${PN} += "python-abi \
python311-dask \
python311-dask-delayed \
python311-numpy"

inherit rpm
