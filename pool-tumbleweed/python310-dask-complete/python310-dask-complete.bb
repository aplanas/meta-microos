SUMMARY = "All dask components"
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
This package pulls in all the optional dask components."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-dask-complete-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "dfcb56f9a0f691e0da474d0c056861323ad662ecbf87e99ae9be48b4d0710e1e6e1216f91366c1601864c6d1a339a421cbe8022b9c8f34827c646fa1a21dc8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-all \
python3-dask-complete \
python310-dask-all \
python310-dask-complete"

RDEPENDS:${PN} += "python310-dask \
python310-dask-array \
python310-dask-bag \
python310-dask-dataframe \
python310-dask-delayed \
python310-dask-diagnostics \
python310-dask-distributed \
python310-dask-dot \
python310-lz4 \
python310-pyarrow"

inherit rpm
