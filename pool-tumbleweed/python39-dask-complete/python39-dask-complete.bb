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

RPM_NAME = "python39-dask-complete-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "c621ab268b3c7081fa20a3f778f4c5f5c066da6c826c4e381abf12944db0d7b3b22100af26c99ff6352993ef0858d88b15692e4290796b15fd06707cdbdabeaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-all \
python39-dask-complete"
RDEPENDS:${PN} += "python39-dask \
python39-dask-array \
python39-dask-bag \
python39-dask-dataframe \
python39-dask-delayed \
python39-dask-diagnostics \
python39-dask-distributed \
python39-dask-dot \
python39-lz4 \
python39-pyarrow"

inherit rpm
