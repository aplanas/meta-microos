SUMMARY = "Data structure generic python objects in dask"
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
This package contains the dask bag class. \
 \
Dask.Bag parallelizes computations across a large collection of \
generic Python objects. It is particularly useful when dealing \
with large quantities of semi-structured data like JSON blobs \
or log files."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python39-dask-bag-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "7c3e8338a63b9bcadfff460978364cc43215108e1fe4fb98b2bbd47b0e0036dda1f6fa4d3b606e92aa6b14fb8522a63aa536a9f8c32d5daba3538c5e2fb6b700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-bag"

RDEPENDS:${PN} += "python-abi \
python39-dask"

inherit rpm
