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

RPM_NAME = "python39-dask-array-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "f9517964226a6fb08d3fb2fdb14e97c74d5e075b58597ef5de526468781572df61bfa5649857cabc6f2c8844d648b888e6279d4681a5b477274ce6e094930281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-array"

RDEPENDS:${PN} += "python(abi) \
python39-dask \
python39-dask-delayed \
python39-numpy"

inherit rpm
