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

PV = "2023.5.1"

RPM_NAME = "python310-dask-complete-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "1948a2a5afa76ee4f0f720e4dc183181c3132a3130325dd500384147c9b1a1a1173ae3b739ac5326153fbd51388242dd4e926d766afa256cb99a0b3e2a43021d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-all \
python310-dask-complete"

RDEPENDS:${PN} += "python310-dask \
python310-dask-array \
python310-dask-dataframe \
python310-dask-diagnostics \
python310-dask-distributed \
python310-lz4 \
python310-pyarrow"

inherit rpm
