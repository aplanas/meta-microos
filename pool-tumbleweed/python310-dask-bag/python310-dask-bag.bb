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

RPM_NAME = "python310-dask-bag-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "9958e27c0f1f3aee4315c0caad532b4d5d4dd22d37a08d6d3083e605ad9794911d100006bffbc04547fa20ac417f9c4cae9156f09823c7735db22e65eb0e82ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-bag \
python310-dask-bag"

RDEPENDS:${PN} += "python(abi) \
python310-dask"

inherit rpm
